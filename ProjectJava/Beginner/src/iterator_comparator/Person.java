package iterator_comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    public void setName(String name) {
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void foo1(ArrayList<? extends Person> people){}
    public <T extends Person> void foo2(ArrayList<T> people){}
}
