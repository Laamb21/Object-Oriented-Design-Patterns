package Command;

public class Client {
    public static void main(String[] args) {
        //Create light object ledLights
        Light ledLigths = new Light();
        
        //Create light on and light off commands, passing ledLights
        Command lightOn = new LightOnCommand(ledLigths);
        Command lightOff = new LightOffCommand(ledLigths);

        //Create RemoteControl object
        RemoteControl remote = new RemoteControl();

        //Set the command for lights on by passing lightOn
        remote.setCommand(lightOn);
        
        //Call execute method by calling pressButton mehtod
        remote.pressButton();

        //Set the command for lights off by passing lightOff
        remote.setCommand(lightOff);

        //Call execute method by calling pressButton method
        remote.pressButton();


    }
}
