package filehandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("G:\\ProjectJava\\Code_w3school\\src\\filehandling\\VanBao.txt");
            if (myObj.createNewFile()) {
                System.out.println("Created successfully " + myObj.getName());
            } else {
                System.out.println("File already exists!");
            }
        }
        catch (Exception e){
            System.out.println("An error occurred!");
        }
    }

}

