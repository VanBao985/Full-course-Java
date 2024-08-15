package javaexception;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] mynumbers={1, 2, 3};
            System.out.println(mynumbers[10]);
        }
            catch(Exception e){
            System.out.println("Something went wrong!: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
