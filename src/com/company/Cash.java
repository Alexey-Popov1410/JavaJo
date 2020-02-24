package com.company;
import java.util.Scanner;
public class Cash {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму в рублях : ");
        int sum = scan.nextInt();
        int num = sum % 100 / 10;
        if (sum < 0){
            System.out.println("Вы ввели не верную сумму");
        } else if (num == 1) {
            System.out.println(sum + " Рублей");
        } else {
            switch (sum % 10) {
                case 1:
                    System.out.println(sum + " Рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(sum + " Рубля");
                    break;
                default:
                    System.out.println(sum + " Рублей");
            }
        }
    }
}
