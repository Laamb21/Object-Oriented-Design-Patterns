package Abstract_Factory_Method;

public class Shape_Factory_Implementation implements Shape_Factory{
    @Override  
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } 
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } 
        else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        else if(shapeType.equalsIgnoreCase("OCTOGON")){
            return new Octogon();
        }
        else if(shapeType.equalsIgnoreCase("POLYGON")){
            return new Polygon();
        }
        return null;   
    }
}
