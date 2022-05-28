package CreationPatterns.FactoryPattern.Example1;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R)");
        if(userInput.hasNextLine()){
            theEnemy = factory.makeEnemyShip(userInput.nextLine());
        }
        doStuffEnemu(theEnemy);
    }

    private static void doStuffEnemu(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
