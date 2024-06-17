package Facade;

import java.util.*;

//Client code to run example
public class Client {
    public static void main(String[] args) {
        //Initialize variables
        Lighting lighting = new Lighting();
        Music music = new Music();
        ClimateControl climateControl = new ClimateControl();
        SmartHome smartHome = new SmartHome(lighting, music, climateControl);
        Scanner input = new Scanner(System.in);

        //Prompt for user input
        System.out.println("Welcome to the Smart Home!");
        System.out.println("Please select an action: ");
        System.out.println("1. Turn on lights");
        System.out.println("2. Turn off lights");
        System.out.println("3. Turn on music");
        System.out.println("4. Turn off music");
        System.out.println("5. Set temperature.");
        
        //Assign input to variable
        int action = input.nextInt();
        
        //Switch statement to call each method in SmnartHome
        switch (action) {
            case 1:
                {
                    smartHome.turnOnLights();
                }
                break;
            case 2:
                {
                    smartHome.turnOffLights();
                }
                break;
            case 3:
                {
                    smartHome.turnOnMusic();
                }
                break;
            case 4:
                {
                    smartHome.turnOffMusic();
                }
                break;
            case 5:
                {
                    System.out.println("Enter your desired temperature");
                    int temp = input.nextInt();
                    smartHome.setTemp(temp);
                }
            default:
                break;
        }

        input.close();
    }
}
