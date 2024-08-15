package filehandling;

import java.io.File;

public class GetInformationFile {
    public static void main(String[] args) {
        File myObj = new File("LinhThu.txt");
        if (myObj.exists()){
            System.out.println("Name: "+ myObj.getName());
            System.out.println("Path: "+ myObj.getAbsolutePath());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("Writable: " + myObj.canWrite());
            System.out.println("File size in bytes: "+myObj.length());
        }
        else {
            System.out.println("File does not exist!");
        }
    }
}
