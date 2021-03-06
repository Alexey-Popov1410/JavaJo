package Lesson04;

public class Atm {
    private static final int RATE_20 = 20;
    private static final int RATE_50 = 50;
    private static final int RATE_100 = 100;
    private int rate20Count;
    private int rate50Count;
    private int rate100Count;

    public Atm(int rate20Count, int rate50Count, int rate100Count) {
        this.rate20Count = rate20Count;
        this.rate50Count = rate50Count;
        this.rate100Count = rate100Count;
    }

    public void addRate20(int rate20Count) {
        this.rate20Count += rate20Count;
    }

    public void addRate50(int rate50Count) {
        this.rate50Count += rate50Count;
    }

    public void addRate100(int rate100Count) {
        this.rate100Count += rate100Count;
    }

    public boolean takeOffMoney(int takeMoney) {
        int rate20 = rate20Count;
        int rate50 = rate50Count;
        int rate100 = rate100Count;
        while (takeMoney != 0) {
            if (takeMoney >= RATE_100 && rate100Count > 0 && (takeMoney / 10) % 2 == 0) {
                takeMoney -= RATE_100;
                rate100Count--;
            } else if (takeMoney >= RATE_50 && rate50Count > 0 && ((takeMoney / 10) % 2 != 0 || takeMoney % 50 == 0)) {
                takeMoney -= RATE_50;
                rate50Count--;
            } else if (takeMoney >= RATE_20 && rate20Count > 0) {
                takeMoney -= RATE_20;
                rate20Count--;
            } else {
                System.out.println("Ошибка выдачи");
                rate20Count = rate20;
                rate50Count = rate50;
                rate100Count = rate100;
                return false;
            }

        }
        System.out.println("Были выданы купюры номиналом\n100 : " + (rate100 - rate100Count) + ";\n 50 : " + (rate50 - rate50Count) + ";\n 20 : " + (rate20 - rate20Count) + ".");
        return true;
    }
}



