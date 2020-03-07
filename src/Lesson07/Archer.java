package Lesson07;

public class Archer extends Hero {
    private String Name;


    public Archer(String Name) {
        this.Name = Name;
    }

    @Override
    public void attackEnemy() {
        int damage = 15;
        System.out.println("Лучник " + Name + " делает выстрел и наносит " + damage + " урона по врагу !");
        Enemy.takeDamage(15);
    }
}
