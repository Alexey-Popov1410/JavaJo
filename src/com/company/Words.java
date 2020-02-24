package com.company;
import java.util.Scanner;
public class Words {
    public static void main(String[] args){
        System.out.println("Введите два слова: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Слово № 1: ");
        String word1 =scan.nextLine();
        System.out.print("Слово № 2: ");
        String word2 =scan.nextLine();
        if (word1.equals(word2)){
            System.out.println("Отлично! Слова одинаковы");
        } else if (word1.equalsIgnoreCase(word2)){
            System.out.println("Хорошо. Почти одинаковы");
        } else if (word1.length() == word2.length()){
            System.out.println("Ну, хотя бы они одной длинны");
        }
    }
}
