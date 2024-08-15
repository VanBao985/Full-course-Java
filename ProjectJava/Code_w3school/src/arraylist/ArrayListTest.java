package arraylist;
import  java.util.ArrayList;
import  java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(3);
        myNumbers.add(-5);
        myNumbers.set(4, -10);
        System.out.println(myNumbers.get(4));
        Collections.sort(myNumbers);
        for (int i: myNumbers){
            System.out.println(i);
        }
    }
}
