package hashmapandhashset;
import java.util.HashMap;

public class HashMapT {
    public static void main(String[] args) {
        HashMap<String, Integer> people=new HashMap<>();
        // Input keys and values (Name, Old)
        people.put("Join", 36);
        people.put("Lili", 25);
        people.put("Atonio", 30);
        people.put("May", 19);
        for (String i : people.keySet()) {
            System.out.println("key: "+i+" values: "+ people.get(i));
        }
    }
}
