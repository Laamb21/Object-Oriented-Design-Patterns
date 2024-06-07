package Composite;

import java.util.ArrayList;

public class Directory implements Abstract_File{
    private String name;
    private ArrayList<Abstract_File> includedFiles = new ArrayList<Abstract_File>();

    public Directory(String name){
        this.name = name;
    }

    public void add(Abstract_File file){
        includedFiles.add(file);
    }

    @Override
    public void Is(){
        System.out.println("Directory: " + name);
        for(Abstract_File i : includedFiles){
            i.Is();
        }
    }
}
