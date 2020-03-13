package Lesson08;

public class Circle implements Figures {
    private static final String NAME1 = "Circle";
    private static final String NAME2 = "Ellipse";
    private  double radius1;
    private  double radius2;

    public Circle(double radius, double radius1) {
        this.radius1 = radius;
        this.radius2 = radius1;
    }
    @Override
    public double getArea(){
        return  Math.PI * radius1 * radius2;
    }
    @Override
    public String getName() {
        if (radius1 == radius2){return NAME1;}
        else {return  NAME2;}
    }
    public double getRadius1() { return radius1;}
    public double getRadius2() { return radius2;}
}
