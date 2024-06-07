package Decorator;

public class Main {
    public static void main(String[] args) {
        //Create Widget with TextField
        Widget widget1 = new TextField(80, 24);

        //Draw Widget
        widget1.draw();

        //Create new Widget by adding ScrollDecorator to existing Widget with TextField
        Widget widget2 = new ScrollDecorator(widget1);

        //Draw Widget
        widget2.draw();

        //Create new Widget by adding BorderDecorator to existing Widget with TextField and ScrollDecorator
        Widget widget3 = new BorderDecorator(widget2);

        //Draw Widget
        widget3.draw();
    }
}
