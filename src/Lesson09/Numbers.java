package Lesson09;

public class Numbers <T extends Number> {
    private boolean doubleOrFloatNumber(T t) {
        return t instanceof Double || t instanceof Float;
    }
    public Number addition(T t1, T t2) {
        if (doubleOrFloatNumber(t1)) {
            return (t1.doubleValue() + t2.doubleValue());
        } else {
            return t1.intValue() + t2.intValue();
        }
    }
    @Transaction
    public Number subtraction(T t1, T t2) {
        if (doubleOrFloatNumber(t1)) {
            return (t1.doubleValue() - t2.doubleValue());
        } else {
            return t1.intValue() - t2.intValue();
        }
    }
    public Number multiplication(T t1, T t2) {
        if (doubleOrFloatNumber(t1)) {
            return (t1.doubleValue() * t2.doubleValue());
        } else {
            return t1.intValue() * t2.intValue();
        }
    }
    @Transaction
    public Number division(T t1, T t2) {
        if (doubleOrFloatNumber(t1)) {
            return (t1.doubleValue() / t2.doubleValue());
        } else {
            return t1.intValue() / t2.intValue();
        }
    }

    public static void main(String[] args) {
        Numbers <Double> calculator1 = new Numbers<>();
        System.out.println(calculator1.multiplication(4.7, 32.0));

        Numbers <Integer> calculator2 = new Numbers<>();
        System.out.println(calculator2.multiplication(4, 57));
    }
}
