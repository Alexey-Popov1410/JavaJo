package Lesson08;

public class Trapeze implements Figures {
    private static final String NAME = "Trapeze";

    private double parallelSide_A;
    private double parallelSide_B;
    private double height;

    public Trapeze(double parallelSide_A, double parallelSide_B, double height) {
        this.parallelSide_A = parallelSide_A;
        this.parallelSide_B = parallelSide_B;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (parallelSide_A + parallelSide_B)* height / 2;
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSideA() {
        return parallelSide_A;
    }
    public double getSideB() {
        return parallelSide_B;
    }
    public double getSideC() {
        return height;
    }
}
