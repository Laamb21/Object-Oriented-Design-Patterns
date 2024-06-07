package Facade;

public interface HotelKepper {
    public VegMenu getVegMenu();
    public NonVegMenu getNonVegMenu();
    public Both getVegAndNonVegMenu();
}
