package Lesson04;

public class Interval {
    private int second;
    private int minute;
    private int hour;


     Interval(int hour, int minute, int second){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        hour *= 3600;
        minute *= 60;
        second = hour + minute + second;
        if (hour < 0 || minute < 0 || second < 0){
            System.out.println("Время не может быть отрицательным");
        } else {
            System.out.println("Общее число секунд : " + second);
        }
    }


    Interval (int second){
        this.second = second;
        hour = second / 3600;
        minute = (second -(hour*3600))/60;
        second = ((second - (hour*3600)) - (minute * 60));
        if (second < 0){
            System.out.println("Время не может быть отрицательным");
        } else {
            System.out.println("Часы . Минуты . Секунды : " + hour + "." + minute + "." + second);
        }
    }


}
class time{
    public static void main(String[] args){
        Interval time = new Interval(4600);
    }
}

