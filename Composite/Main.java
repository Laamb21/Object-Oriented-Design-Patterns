package Composite;

public class Main {
    public static void main(String[] args) {
        //Create file objects
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        File file5 = new File("file5.txt");
        File file6 = new File("file6.txt");

        //Create directory objects
        Directory root = new Directory("root");
        Directory dir1 = new Directory("subDir1");
        Directory dir2 = new Directory("subDir2");

        //Add files to subdirectory 1
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        //Add files to subdirectory 2
        dir2.add(file4);
        dir2.add(file5);
        dir2.add(file6);

        //Add subdirectories to root directory
        root.add(dir1);
        root.add(dir2);

        //Print directories and files with "Is" method
        root.Is();
    }
}
