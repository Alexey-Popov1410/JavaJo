package Lesson07;

public abstract class Hero {
    private String Name;

    public Hero (String Name) {
        this.Name = Name;
    }

    public Hero() {
    }

    public String getName() {
        return Name;
    }

    public abstract void attackEnemy();
}
