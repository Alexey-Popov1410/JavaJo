package Lesson08;

public class Main {
    public static void main(String[] args) {
        Figures figure[]
                = {new Rectangle( 12,9),
                new Triangle(13, 6, 8),
                new Circle(11,13),
                new Trapeze(8, 11, 7),
                new Parallelogram(7,7),
                new Rhombus(7,12)
        };

        for(Figures fig : figure)
            System.out.println("This " + fig.getName()+ " = " + fig.getArea() + " - Area");

        System.out.println(figure[0] instanceof Rectangle);
        System.out.println(figure[1] instanceof Triangle);
        System.out.println(figure[2] instanceof Circle);
        System.out.println(figure[3] instanceof Trapeze);
        System.out.println(figure[4] instanceof Circle);
        System.out.println(figure[4] instanceof Parallelogram);
        System.out.println(figure[5] instanceof Rhombus);
        System.out.println(figure[1] instanceof Circle);
    }
}
