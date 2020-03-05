package Lesson07;

public class Enemy implements Mortal {
    private static int health;


    public Enemy (int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public static int takeDamage(int damage){
        return damage;
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
