package Prototype;

//Client code
public class Shape_Client {
    private Shape shapePrototype;

    public Shape_Client(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}
