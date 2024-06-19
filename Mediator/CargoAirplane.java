package Mediator;

public class CargoAirplane implements Airplane{
    private AirTrafficControlTower mediator;

    public CargoAirplane(AirTrafficControlTower mediator){
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
        System.out.println("Cargo Airplane: " + message);
    }
}
