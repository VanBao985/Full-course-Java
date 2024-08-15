package exception_try_catch;


public class TestAverage {
    public static void main(String[] args) {
        CaculateAverage obj = new CaculateAverage();
        try {
            System.out.println(obj.getAverage("123"));
            System.out.println(obj.getAverage("5i3"));
        }
        catch (Exception e){
            System.out.println("Please return input: ");
        }
    }
}
