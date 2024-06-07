package Facade;

public class VegResturant implements Hotel{
    public Menus getMenus(){
        VegMenu v = new VegMenu();
        return v;
    }
}
