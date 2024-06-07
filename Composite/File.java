package Composite;

public class File implements Abstract_File{
    private String name;
    
    public File(String name){
        this.name = name;
    }

    @Override
    public void Is(){
        System.out.println("File: " + name);
    }
}
