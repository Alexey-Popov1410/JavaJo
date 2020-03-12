package Lesson08;

public class Main {
    public static void main(String[] args) {
        Figures figure[]
                = {new Rectangle( 9,9),
                new Triangle(9, 8, 8),
                new Circle(9,9),
                new Trapeze(6, 9, 7),
                new Parallelogram(9,9),
                new Rhombus(9,10)
        };

        for(Figures fig : figure)
            System.out.println("This " + fig.getName()+ " = " + fig.getArea());

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
