package Facade;

//Smart Home class
public class SmartHome {
    //Initialize private variables
    private Lighting lighting;
    private Music music;
    private ClimateControl climateControl;

    //Constructor
    public SmartHome(Lighting lighting, Music music, ClimateControl climateControl){
        this.lighting = lighting;
        this.music = music;
        this.climateControl = climateControl;
    }

    //Method to turn on lights
    public void turnOnLights(){
        lighting.on();
    }

    //Method to turn off lights
    public void turnOffLights(){
        lighting.off();
    }

    //Method to turn on music
    public void turnOnMusic(){
        music.playMusic();
    }

    //Method to turn off music
    public void turnOffMusic(){
        music.stopMusic();
    }

    //Method to set temperature
    public void setTemp(int temp){
        climateControl.setTemp(temp);
    }
}
