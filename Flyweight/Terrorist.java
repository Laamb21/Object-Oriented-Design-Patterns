package Flyweight;

//Terrorist class 
public class Terrorist implements Player{
    //Intrinsic attribute
    private final String task;

    //Extrinsic attribute
    private String weapon;

    //Constructor
    public Terrorist(){
        task = "plant a bomb";
    }

    //Method implementations from Player interface 
    @Override
    public void assignWeapon(String weapon){
        this.weapon = weapon;
    }

    @Override 
    public void mission(){
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task: " + task);
    }
}
