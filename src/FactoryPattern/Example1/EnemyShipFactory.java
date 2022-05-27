package FactoryPattern.Example1;

public class EnemyShipFactory {

    /*
    Move all the decision-making in to another class
     */

    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equals("U")){
            return new UFOEnemyShip();
        }
        else if (newShipType.equals("R")){
            return new RocketEnemyShip();
        }
        else{
            return null;
        }
    }
}
