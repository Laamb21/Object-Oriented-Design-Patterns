package Adapter;

public class Good_Example {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle_Adapter(new Rectangle()), new Line_Adapter(new Line())};
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;
        for(Shape shape : shapes){ //Does not need to check for type, will draw regardless
            shape.draw(x1, y1, x2, y2);
        }
    }
}
