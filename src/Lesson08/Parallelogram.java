package Lesson08;

public class Parallelogram implements Figures {
    private static final String NAME = "Parallelogram";

    private double side;
    private double height;

    public Parallelogram(double side, double height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public String getArea() {
        return side * height + " - Area";
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSide() { return side; }
    public double getHeight() {return height; }
}
