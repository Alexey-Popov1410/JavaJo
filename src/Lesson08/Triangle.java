package Lesson08;

public class Triangle implements Figures {
    private static final String NAME = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double A, double B, double C) {
        this.sideA = A;
        this.sideB = B;
        this.sideC = C;
    }
    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return  Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
}
