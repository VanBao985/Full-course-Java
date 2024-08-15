package exception_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileInteger {
    public void readListInteger(String fileName) throws IOException {
        if (fileName == null){
            throw new IOException("Please input file name!");
        }
        try{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);  // Maybe not found a file
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        try {
            while (sc.hasNextLine()){
                int num = Integer.parseInt(sc.nextLine());
                System.out.println(num);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Is not a number");
        }
        // Don't need finally, because: file auto close!!!
    }
}
