package iterator_comparator;

import java.util.Comparator;

public class IteratorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int age1 = ((Person) o1).getAge();
        int age2 = ((Person) o2).getAge();
        if (age1 > age2) return 1;
        else {
            if (age1 < age2) return -1;
            else return 0;
        }
    }
}
