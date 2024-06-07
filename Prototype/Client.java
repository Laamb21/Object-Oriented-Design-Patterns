package Prototype;

public class Client {
    public static void main(String[] args) {
        Concrete_Protoype protoype1 = new Concrete_Protoype("Original");
        Concrete_Protoype protoype2 = protoype1.clone();

        System.out.println("Prototype 1 attribute: " + protoype1.getAttribute());
        System.out.println("Prototype 2 attribute: " + protoype2.getAttribute());

        protoype2.setAttribute("Modified");

        System.out.println("Prototype 1 attribute: " + protoype1.getAttribute());
        System.out.println("Prototype 2 attribute: " + protoype2.getAttribute());
    }
}
