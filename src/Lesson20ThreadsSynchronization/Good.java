package Lesson20ThreadsSynchronization;




public class Good {
    private int id;
    private String name;
    private double price;
    private double discount;

    public Good(int id, String name, double price, double discount) {
        if (id < 0 || name == null || price < 0 || discount < 0 || discount > 0.9) {
            System.out.println("Объект не создан! Проверьте данные");
        } else {
            this.id = id;
            this.name = name;
            this.price = price;
            this.discount = discount;
        }
    }

    public Object getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}
