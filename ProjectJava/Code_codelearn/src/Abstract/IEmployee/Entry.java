package Abstract.IEmployee;
import java.util.*;

public class Entry {
    public static void main(String[] args) {
        IEmployee[] employee = new IEmployee[5];
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < 5; i++) {
            String name = sc.next();
            int paymentPerHour = sc.nextInt();
            int workingHours = sc.nextInt();
            int number = rd.nextInt(2);
            if (number == 1){
                employee[i] = new PartTimeEmployee(name, paymentPerHour, workingHours);
            }
            else{
                employee[i] = new FullTimeEmployee(name, paymentPerHour);
            }
        }
    }
}
