package factory;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {

//        EnemyShip theEnemy = null;
//
//        UFOEnemyShip ufoEnemyShip = new UFOEnemyShip();
//
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//        System.out.print("What type of ship? (U or R)");
//
//        if (userInput.hasNextLine()){
//            enemyShipOption = userInput.nextLine();
//        }
//
//        if (enemyShipOption.equals("U")){
//            theEnemy = new UFOEnemyShip();
//        } else if (enemyShipOption.equals("R")){
//            theEnemy = new RocketEnemyShip();
//        }

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){

            doStuffEnemy(theEnemy);

        } else System.out.println("Please enter U, R, or B next time");


    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
