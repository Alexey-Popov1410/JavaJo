package Lesson07;

public class Archer extends Hero {
    private String Name;

    public Archer(String Name) {
        this.Name = Name;
    }

    @Override
    public void attackEnemy() {
        System.out.println("Лучник " + Name + " делает выстрел и наносит " + Enemy.takeDamage(15) + " урона по врагу !");
    }
}
