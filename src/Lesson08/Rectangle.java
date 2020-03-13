package Lesson08;

public class Rectangle implements Figures {
    private static final String NAME1 = "Rectangle";
    private static final String NAME2 = "Square";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public String getName() {
        if (width == height){
            return NAME2;
        }
        return NAME1;
    }
    public double getWidth() { return width; }
    public double getHeight() {return height; }
}
