package exception_try_catch;

import java.io.IOException;

public class CaculateAverage {
    private static int N = 0;
    private static double average = 0.0;
    public double getAverage(String s) throws IOException{
        if (s==null) {
            throw new IOException("Input invalid: Not found number!");
        }
        try{
            double number = Double.parseDouble(s);
            try{
                int numberInt = Integer.parseInt(s);
            }
            catch (NumberFormatException e){
                System.out.println("Input error: Is not a integer number!");
            }
        }
        catch (NumberFormatException e){
            System.out.println("Input error: Is not a number!");
        }
        average = average * N + Integer.parseInt(s);
        N++;
        return average/N;
    }
}
