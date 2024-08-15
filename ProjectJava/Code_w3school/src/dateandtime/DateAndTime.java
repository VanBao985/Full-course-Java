package dateandtime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime myobj1 = LocalTime.now();
        LocalDate myobj2 = LocalDate.now();
        LocalDateTime objDateTime = LocalDateTime.now();
        System.out.println(myobj1);
        System.out.println(myobj2);
        System.out.println(objDateTime);
    }
}
