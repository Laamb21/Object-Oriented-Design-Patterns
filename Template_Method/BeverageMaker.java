package Template_Method;

//Abstract class defining template method
public abstract class BeverageMaker {
    //Template method for defining overall process
    public final void makeBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    //Abstract methods to be implemented by subclasses
    abstract void brew();
    abstract void addCondiments();

    //Common methods
    void boilWater(){
        System.out.println("Boiling water.");
    }

    void pourIntoCup(){
        System.out.println("Pouring into cup");
    }
}
