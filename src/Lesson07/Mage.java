package Lesson07;

public class Mage extends Hero {
    private String Name;


    public Mage(String Name) {
        this.Name = Name;
    }

    @Override
    public void attackEnemy() {
        int damage = 25;
        System.out.println("Маг " + Name + " кастует фаербол и наносит " + damage + " урона врагу !");
        Enemy.takeDamage(25);
    }
}
