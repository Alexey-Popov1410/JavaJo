package Lesson20ThreadsSynchronization;



import java.util.List;


public class Receipt {
    private int id;
    private String date;
    private int casseNo;
    private List<Item> items;
    private double totalSum;
    private double change;
    private double paid;

    public Receipt(int i, String format, int casseNo, List<Item> items,
                   double totalSum, double round, double moneyFromBuyer) {
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", casseNo=" + casseNo +
                ", items=" + items +
                ", totalSum=" + totalSum +
                ", change=" + change +
                ", paid=" + paid +
                '}';
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
