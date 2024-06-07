package Prototype;

//Main class
public class Main {
    public static void main(String[] args) {
        //Create concrete prototypes 
        Shape circlePrototype = new Circle("blue");
        Shape squarePrototype = new Square("green");

        //Create a client and give it the circle prototype 
        Shape_Client client1 = new Shape_Client(circlePrototype);

        //Use the prototype to create a new shape 
        Shape blueCircle = client1.createShape();

        //Draw blue circle
        blueCircle.draw();

        //Create another client and give it the square prototype
        Shape_Client client2 = new Shape_Client(squarePrototype);
        
        //Use the prototype to create a new shape 
        Shape greenSquare = client2.createShape();
        
        //Draw green square
        greenSquare.draw();

    }
}
