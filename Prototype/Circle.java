package Prototype;

//Concrete prototype
public class Circle implements Shape {
    private String color;
    
    //When Circle is created, it is given a color
    public Circle(String color) {
        this.color = color;
    }

    //Creates copy of Circle
    @Override
    public Shape clone(){
        return new Circle(this.color);
    }

    //Draws Circle
    @Override   
    public void draw(){
        System.out.println("Drawing a " + color + " circle.");
    }
}
