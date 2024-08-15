package filehandling;

import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("LinhThu.txt");
            fileWriter.write("Linh Thu is much much adorable!\n");
            fileWriter.write("Van Bao Van Bao!!!");
            fileWriter.close();
            System.out.println("Writing successfully!");
        }
        catch (Exception e){
            System.out.println("An error occurred!");
        }

    }
}
