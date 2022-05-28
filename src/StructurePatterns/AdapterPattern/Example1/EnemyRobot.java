package StructurePatterns.AdapterPattern.Example1;

import java.util.Random;

public class EnemyRobot {

    Random random = new Random();

    public void smashWithHands(){
        int attackDamage = random.nextInt(10)+1;
        System.out.println("Enemy Robot Causes " +attackDamage +" with hands");
    }

    public void walkForward(){
        int movement = random.nextInt(5);
        System.out.println("Enemy Robot Walks " +movement);
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot Tramps on " +driverName);
    }
}
