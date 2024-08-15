package javaexception;

public class TestCopyFile {
    public static void main(String[] args) {
        FileExample fileExample = new FileExample();
        try {
            fileExample.copyFile("Bao", "Bao");
        }
        catch (DefineException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
