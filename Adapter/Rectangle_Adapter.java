package Adapter;

public class Rectangle_Adapter implements Shape{
    private Rectangle adaptee;

    public Rectangle_Adapter(Rectangle rect){
        this.adaptee = rect;
    }
    
    @Override
    public void draw(int x1, int y1, int x2, int y2){
        int x = Math.max(x1, x2);
        int y = Math.max(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        adaptee.draw(x, y, width, height);
    }

}
