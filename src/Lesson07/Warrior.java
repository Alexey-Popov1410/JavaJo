package Lesson07;

public class Warrior extends Hero  {
    private String Name;


    public Warrior(String Name) {
        this.Name = Name;
    }


    @Override
    public void attackEnemy() {
        int damage = 25;
        System.out.println("Воин " + Name + " делает удар секирой и наносит " + damage + " урона врагу !");
        Enemy.takeDamage(25);
    }
}
