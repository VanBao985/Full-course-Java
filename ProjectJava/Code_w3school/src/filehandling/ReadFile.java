package filehandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("LinhThu.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNext()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
