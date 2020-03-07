package Lesson07;

public class Enemy implements Mortal {
    public static int health;


    public Enemy (int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public static void takeDamage(int damage){
        health = health - damage;
        System.out.println("У врага осталось " + health + " здоровья.");
    }



    public boolean isAlive(){
        if(health > 0){
            return true;
        } else {
            System.out.println("Враг повержен !");
        }
        return false;
    }
}
