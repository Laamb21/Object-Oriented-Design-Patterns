package Mediator;

public class Main {
    public static void main(String[] args) {
        //Instantiate mediator (air traffic control tower)\
        AirTrafficControlTower controlTower = new AirportControlTower();

        //Instantiate concrete colleagues (airplanes)
        Airplane commercialAirplane1 = new CommercialAirplane(controlTower);
        Airplane commercialAirplane2 = new CommercialAirplane(controlTower);
        Airplane commercialAirplane3 = new CommercialAirplane(controlTower);
        Airplane cargoAirplane1 = new CargoAirplane(controlTower);
        Airplane cargoAirplane2 = new CargoAirplane(controlTower);
        Airplane cargoAirplane3 = new CargoAirplane(controlTower);
        Airplane privateJet1 = new PrivateJet(controlTower);
        Airplane privateJet2 = new PrivateJet(controlTower);
        Airplane privateJet3 = new PrivateJet(controlTower);

        //Set up association between Concrete Colleagues and Mediator
        commercialAirplane1.requestTakeoff();
        commercialAirplane2.requestLanding();
        commercialAirplane3.requestTakeoff();
        cargoAirplane1.requestLanding();
        cargoAirplane2.requestTakeoff();
        cargoAirplane3.requestLanding();
        privateJet1.requestTakeoff();
        privateJet2.requestLanding();
        privateJet3.requestTakeoff();
    }
}
