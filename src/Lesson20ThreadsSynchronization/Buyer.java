package Lesson20ThreadsSynchronization;



import java.util.HashMap;
import java.util.Map;


public class Buyer implements Runnable {
    Receipt receipt;
    private Map<Good, Integer> goods;
    private Shop shop;

    public Buyer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println(String.format("покупатель %s зашел в магазин", Thread.currentThread().getName()));
        goods = new HashMap<>();
        putGoods();
        if (goods.size() == 0) {
            return;
        }
        takeTurns();
    }

    private void putGoods() {
        int countGoods = (int) (Math.random() * 5);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        if (countGoods == 0) {
            System.out.println(String.format("покупатель %s ничего не выбрал и ушел", Thread.currentThread().getName()));
        } else {
            for (int i = 0; i < countGoods; i++) {
                int goodId = (int) (Math.random() * 12) + 1;
                int value = (int) (Math.random() * 3) + 1;
                Good good = shop.getGood(goodId);
                if (good != null) {
                    goods.put(good, value);
                    System.out.println(String.format("покупатель %s взял %d товаров %s",
                            Thread.currentThread().getName(), value, good.getName()));
                } else {
                    System.out.println(String.format("уже нет ожедаемого товара для покупателя %s ", Thread.currentThread().getName()));
                }
            }
        }
    }

    private void takeTurns() {
        try {
            CashBox cashbox = shop.takeQueue();
            System.out.println(String.format("покупатель %s занял кассу %d", Thread.currentThread().getName(), cashbox.getCasseNo()));
            double sumCost = cashbox.makeSum(goods);
            receipt = cashbox.payOff(goods, Math.ceil(sumCost));
            System.out.println(String.format("чек покупателя:\n%s %s", Thread.currentThread().getName(), receipt.toString()));
            shop.leaveQueue(cashbox);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
