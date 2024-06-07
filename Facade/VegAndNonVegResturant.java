package Facade;

public class VegAndNonVegResturant implements Hotel{
    public Menus getMenus(){
        Both b = new Both();
        return b;
    }
}
