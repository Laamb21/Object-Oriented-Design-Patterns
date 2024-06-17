package Proxy;

//Proxy Image class
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    //Constructor 
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override 
    public void display(){
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();;
    }
}
