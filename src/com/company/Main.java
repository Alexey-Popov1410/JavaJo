package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год : ");
        int year = scan.nextInt();
        boolean num1 = year % 100 == 0;
        boolean num2 = year % 400 == 0;
        boolean num3 = year % 4 ==0;
        if (num1 && num2){
            System.out.println("Вы ввели високосный год");
        } else if (num1 && num3){
            System.out.println("Вы ввели не високосный год");
        } else if (year % 4 == 0){
            System.out.println("Вы ввели високосный год");
        } else {
            System.out.println("Вы ввели не високосный год");
        }
    }
}