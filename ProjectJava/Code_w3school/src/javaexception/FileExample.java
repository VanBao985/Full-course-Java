package javaexception;

public class FileExample {
    public void copyFile (String str1, String str2) throws DefineException{
        if (str1.equals(str2)){
            throw new DefineException("Same file name");
        }
        System.out.println("Copy complete!");
    }
}
