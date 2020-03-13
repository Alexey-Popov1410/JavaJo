package Lesson08;

public class Rhombus implements Figures {
    private static String NAME = "Rhombus";
    private double diagonal;
    private double diagonal2;

    public Rhombus(double diagonal, double diagonal2) {
        this.diagonal = diagonal;
        this.diagonal2 = diagonal2;
    }
    @Override
    public double getArea() {
        return (diagonal * diagonal2)/2;
    }
    @Override
    public String getName() {
        if (diagonal == diagonal2) {
            NAME = "Square";
        }
        return NAME;
    }
    public double getDiagonal() {return diagonal; }
    public double getDiagonal2() {return diagonal2; }
}
