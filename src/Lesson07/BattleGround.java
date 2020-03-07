package Lesson07;

public class BattleGround  {
    public static void main(String[] args) {
        Enemy villain = new Enemy(100);
        Hero gimli = new Warrior("Гимли");
        Hero gendalf = new Mage("Гендальф");
        Hero legalas = new Archer("Легалас");
        gimli.attackEnemy();
        villain.isAlive();
        if(Enemy.health > 0){
            gendalf.attackEnemy();
            villain.isAlive();
        } if (Enemy.health > 0){
            legalas.attackEnemy();
            villain.isAlive();
        }
    }
}
