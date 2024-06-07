package Facade;

public class NonVegResturant implements Hotel{
    public Menus getMenus(){
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
