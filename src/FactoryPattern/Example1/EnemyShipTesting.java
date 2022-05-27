package FactoryPattern.Example1;

import java.util.Scanner;

public class EnemyShipTesting {

    /*
    Example below shows how we do this WITHOUT the Factory pattern.
     */
    public static void main(String[] args) {
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship? (U / R)");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.next();
        }
        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        }
        else{
            theEnemy = new RocketEnemyShip();
        }
        doStuffEnemu(theEnemy);
    }

    private static void doStuffEnemu(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
