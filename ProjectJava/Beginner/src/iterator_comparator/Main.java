package iterator_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person();
        person1.setAge(10); people.add(person1);
        Person person2 = new Person();
        person2.setAge(7); people.add(person2);
        Person person3 = new Person();
        person3.setAge(15); people.add(person3);
        Person person4 = new Person();
        person4.setAge(19); people.add(person4);
        Person person5 = new Person();
        person5.setAge(11); people.add(person5);
        Person person6 = new Person();
        person6.setAge(3); people.add(person6);
        for (Person i: people){
            System.out.println(i.getAge() + " ");
        }
//        Collections.sort(people, new IteratorComparator());
//         Write Comparator with Lambda expression
        Collections.sort(people, (Object o1, Object o2) -> {
            int age1 = ((Person) o1).getAge();
            int age2 = ((Person) o2).getAge();
            if (age1 > age2) return 1;
            else {
                if (age1 < age2) return -1;
                else return 0;
            }
        });
        for (Iterator<Person> i = people.iterator(); i.hasNext();){
            Person person = i.next();
            System.out.println(person.getAge());
        }
    }
}
