package Prototype;

public class Concrete_Protoype implements Prototype{
    private String attribute;

    public Concrete_Protoype() {
    }

    public Concrete_Protoype(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public Concrete_Protoype clone() {
        try{
            return (Concrete_Protoype) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
}
