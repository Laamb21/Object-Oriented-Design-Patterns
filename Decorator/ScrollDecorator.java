package Decorator;

public class ScrollDecorator extends Decorator{
    public ScrollDecorator(Widget widget){
        super(widget);
    }

    public void draw(){
        super.draw();
        System.out.println(" ScrollDecorator");
    }
}
