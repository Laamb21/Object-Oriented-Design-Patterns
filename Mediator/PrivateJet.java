package Mediator;

public class PrivateJet implements Airplane{
    private AirTrafficControlTower mediator;

    public PrivateJet(AirTrafficControlTower mediator){
        this.mediator = mediator;
    }

    @Override 
    public void requestTakeoff(){
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding(){
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message){
        System.out.println("Private Jet: " + message);
    }
}
