package Flyweight;

import java.util.*;

//Player factory class
public class PlayerFactory {
    //HashMap that stores references to Terrorists and Counter Terrorists
    private static HashMap <String, Player> hm = new HashMap<String, Player>();

    //Method to get a player
    public static Player getPlayer(String type){
        Player player = null;

        //If a Terrorist or Counter Terrorist object has already been created, return its reference
        if(hm.containsKey(type))
            player = hm.get(type);
        
        //If a Terrorist or Counter Terrorist object has not been created yet, 
        //create one based on the type passed and insert into HashMap
        else{
            //Switch statement to create Terrorist or Counter Terrorist object 
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist created");
                    player = new Terrorist();
                    break;

                case "CounterTerrorist":
                    System.out.println("Counter Terrorist created");
                    player = new CounterTerrorist();
                    break;
                default:
                    break;
            }

            //One object is created, store in HashMap
            hm.put(type, player);
        }

        return player;
    }
}
