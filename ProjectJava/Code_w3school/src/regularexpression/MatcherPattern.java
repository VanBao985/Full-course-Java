package regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3school", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("W3school is very good!");
        boolean matcherFound = matcher.find();
        if (matcherFound){
            System.out.println("Found!");
        }
        else {
            System.out.println("Not found!");
        }
    }
}
