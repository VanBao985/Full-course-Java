package filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("VanBao.txt");
        if (myObj.delete()){
            System.out.println("Delete successfully ");
        }
        else {
            System.out.println("Error occurred!");
        }
    }
}
