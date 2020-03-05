package Lesson07;

public class Mage extends Hero {
    private String Name;

    public Mage(String Name) {
        this.Name = Name;
    }

    @Override
    public void attackEnemy() {
        System.out.println("Маг " + Name + " кастует фаербол и наносит " + Enemy.takeDamage(25) + " урона врагу !");
    }
}
