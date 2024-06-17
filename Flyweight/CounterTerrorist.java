package Flyweight;

//Counter Terrorist class
public class CounterTerrorist implements Player{
    //Intrinsic attribute
    private final String task;

    //Extrinsic attribute
    private String weapon;

    //Constructor
    public CounterTerrorist(){
        task = "defuse a bomb";
    }

    //Method implementations from Player interface
    @Override 
    public void assignWeapon(String weapon){
        this.weapon = weapon;
    }

    @Override
    public void mission(){
        System.out.println("Counterterrorist with " + weapon + "|" + " Task: " + task);
    }
}
