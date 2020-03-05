package Lesson05;

import java.math.BigDecimal;

public class Numbers {
    private int firstNumber;
    private double secondNumber;


    public  int computing (int firstNumber){
        return firstNumber + firstNumber;
    }

    public double computing (double secondNumber, int firstNumber){
        return secondNumber - firstNumber;
    }

    public double computing (double secondNumber){
        return secondNumber * secondNumber;
    }

    public double computing (int firstNumber, double secondNumber){
        return  firstNumber / secondNumber;
    }
    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println(num.computing(10));

        BigDecimal decimal = new BigDecimal(123.4392992);
        BigDecimal resultSum = decimal.add(BigDecimal.valueOf(130));
        System.out.println(resultSum);
        BigDecimal resultSubtraction = decimal.subtract(BigDecimal.valueOf(120));
        System.out.println(resultSubtraction);
        BigDecimal resultMultiplication = decimal.multiply(BigDecimal.valueOf(3));
        System.out.println(resultMultiplication);
        BigDecimal resultDivision = decimal.divide(BigDecimal.valueOf(5));
        System.out.println(resultDivision);
    }
}
