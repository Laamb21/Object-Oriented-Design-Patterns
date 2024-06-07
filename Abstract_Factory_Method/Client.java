package Abstract_Factory_Method;

public class Client {
    public static void main(String[] args) {
        Shape_Factory shapeFactory = new Shape_Factory_Implementation();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Triangle");
        shape3.draw();
        Shape shape4 = shapeFactory.getShape("Octogon");
        shape4.draw();
        Shape shape5 = shapeFactory.getShape("Polygon");
        shape5.draw();
    }
}
