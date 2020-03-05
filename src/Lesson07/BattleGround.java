package Lesson07;

public class BattleGround  {
    public static void main(String[] args) {
        Enemy villain = new Enemy(100);
        Hero gimli = new Warrior("Гимли");
        Hero gendalf = new Mage("Гендальф");
        Hero legalas = new Archer("Легалас");
        gimli.attackEnemy();
        gendalf.attackEnemy();
        legalas.attackEnemy();
        villain.isAlive();
    }
}
