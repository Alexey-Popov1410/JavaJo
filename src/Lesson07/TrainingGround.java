package Lesson07;

public class TrainingGround  {
    public static void main(String[] args) {
        Hero gimli = new Warrior("Гимли");
        Hero gendalf = new Mage("Гендальф");
        Hero legalas = new Archer("Легалас");
        gimli.attackEnemy();
        gendalf.attackEnemy();
        legalas.attackEnemy();
    }
}
