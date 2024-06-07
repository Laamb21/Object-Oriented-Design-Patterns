package Adapter;

public class Bad_Example {
    public static void main(String[] args) {
        Object[] shapes = { new Line(), new Rectangle()};
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;
        int width = 40;
        int height = 40;
        for(Object shape : shapes){ //Needs to check for type, NO BUENO
            if(shape.getClass().getSimpleName().equals("Line")){
                ((Line) shape).draw(x1, y1, x2, y2);
            }
            else if(shape.getClass().getSimpleName().equals("Rectangle")){
                ((Rectangle) shape).draw(x2, y2, width, height);
            }
        }
    }
}
