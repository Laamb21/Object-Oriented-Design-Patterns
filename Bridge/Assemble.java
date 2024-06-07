package Bridge;

//Concrete implementation 2
public class Assemble implements Workshop{
    @Override
    public void work(){
        System.out.print(" and");
        System.out.println(" Assembled.");
    }
}
