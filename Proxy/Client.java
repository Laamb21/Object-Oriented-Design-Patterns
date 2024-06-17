package Proxy;

//Client code
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.png");

        //Image will be loaded from disk only when display method is called
        image.display();

        //Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}
