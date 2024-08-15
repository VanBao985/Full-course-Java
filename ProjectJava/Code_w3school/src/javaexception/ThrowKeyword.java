package javaexception;

public class ThrowKeyword {
    public static void checkAge(int age) throws ArithmeticException, NullPointerException {
        if (age < 18) {
            throw new ArithmeticException("Access dinied - You must be at least 18 years old.");
        }
        if (age == 0){
            throw new NullPointerException("Not found name!");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
