package Proxy;

//Real Image class
public class RealImage implements Image{
    private String fileName;

    //Constructor
    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    //Methods
    private void loadImageFromDisk(){
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying image: " + fileName);
    }
}
