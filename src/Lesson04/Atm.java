package Lesson04;

public class Atm {
    private int cash20;
    private int cash50;
    private int cash100;
    private int allCash;

    public static void main(String[] args){
        Atm one = new Atm(7,2,5);


    }

    public Atm(int cash20, int cash50, int cash100){
        this.cash20 = 0;
        this.cash50 = 0;
        this.cash100 = 0;
    }
    public static void addCash(int cash20, int cash50, int cash100, int addCash20, int addCash50, int addCash100){
        cash20 += addCash20;
        cash50 += addCash50;
        cash100 += addCash100;
        int allAddCash = addCash20 * 20 + addCash50 * 50 + addCash100 * 100;
        int allCash = cash20 * 20 + cash50 * 50 + cash100 * 100;

    }

    public static boolean takeAwayCash(int sum, int cash20, int cash50, int cash100){
        if(sum > cash20 * 20 + cash50 * 50 + cash100 * 100){
            sum -= cash20 * 20 + cash50 * 50 + cash100 * 100;
            return true;
        }else return false;
    }
}



