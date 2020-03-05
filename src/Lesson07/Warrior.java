package Lesson07;

public class Warrior extends Hero  {
    private String Name;

    public Warrior(String Name) {
        this.Name = Name;
    }

    @Override
    public void attackEnemy() {
        System.out.println("Воин " + Name + " делает удар секирой и наносит " + Enemy.takeDamage(10) + " урона врагу !");

    }
}
