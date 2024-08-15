package exception_try_catch;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class splitListInteger {
    ReadWriteFile readWriteFile;
    String str = new String();
    public void WriteFile(String filePath1, String filePath2, String filePath3, String filePath4) {
        try {
            readWriteFile.readFile("BT10_3");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        str=readWriteFile.getStr();
        int n = str.length();
        try {
            BufferedWriter bW=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath1), StandardCharsets.UTF_8));
            bW.write(Integer.toString(n/4));
            bW.newLine();
            for (int i = 0; i < n/4; i++){
                bW.write(str.charAt(i));
                bW.newLine();
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
