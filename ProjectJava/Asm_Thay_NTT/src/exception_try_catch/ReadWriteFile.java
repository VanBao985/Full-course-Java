package exception_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    private String str = "";
    public void readFile(String fileName) throws IOException{  // fileName: path File
        if (fileName == null){
            throw new IOException("Please input file name!");
        }
        try{
            Scanner scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e){
            System.out.println("Not found this file");
        }
        catch (IOException e){
            System.out.println("Don't read, please check again.");
        }
        try{
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                int number = Integer.parseInt(sc.nextLine());
                this.str = this.str + Integer.toString(number);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Non number.");
        }
    }
    public String getStr() {
        return str;
    }
}
