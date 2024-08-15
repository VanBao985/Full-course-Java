package dateandtime;
import  java.time.LocalDateTime;
import  java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDateTime myobjbefore = LocalDateTime.now();
        System.out.println("Before Formatting: " + myobjbefore);
        DateTimeFormatter myobjFormat = DateTimeFormatter.ofPattern("yyyy-MMM-dd,E  hh:mm:ss");
        String myobjafter = myobjbefore.format(myobjFormat);
        System.out.println("After Formatting: "  + myobjafter);
    }
}
