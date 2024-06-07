package Prototype;

public class Square implements Shape{
    private String color;
    
    //When Square is created, it is given a color
    public Square(String color) {
        this.color = color;
    }

    //Creates copy of Square
    @Override
    public Shape clone(){
        return new Square(this.color);
    }

    //Draws Square
    @Override   
    public void draw(){
        System.out.println("Drawing a " + color + " square.");
    }
}
