package Flyweight;

import java.util.Random;

//Main class 
public class CounterStrike {
    //Initialize all player types and weapons
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = 
        {
            "Knife",
            "Desert Eagle", "Dual Berettas","Five-SeveN","Glock-18","P228","USP",
            "M3","XM1014",
            "MAC-10","MP5","P90","TMP","UMP-45",
            "AK-47","AUG","FAMAS","Galil","M4A1-S","M4A4","SG 552",
            "AWP","G3SG1","Scout","SG 550",
            "M2479","M60"
        };

    //Driver code
    public static void main(String[] args) {
        //Total of 10 players
        for(int i = 0; i < 10; i++){
            Player player = PlayerFactory.getPlayer(getRandomPlayerType());
            player.assignWeapon(getRandomPlayerWeapon());
            player.mission();
        }
    }

    //Method to get random player type
    public static String getRandomPlayerType(){
        Random random = new Random();
        int randInt = random.nextInt(playerType.length);
        return playerType[randInt];
    }

    //Method to get random player weapon
    public static String getRandomPlayerWeapon(){
        Random random = new Random();
        int randInt = random.nextInt(weapons.length);
        return weapons[randInt];
    }
}
