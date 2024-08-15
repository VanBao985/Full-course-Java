package Test_demo;

import shape_circle_square.Circle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class GenericProgramming <T> {
    private T value;
    public GenericProgramming(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static <E> void print(E[] element){
        for(E i : element){
            System.out.println(i);
        }
    }
}

class Main{
    public static void main(String[] args) {
        GenericProgramming<String> stringGenericProgramming = new GenericProgramming<>("Van Bao!");
        GenericProgramming<Integer> integerGenericProgramming = new GenericProgramming<>(3);
        GenericProgramming<Circle> circleGenericProgramming = new GenericProgramming<>(new Circle("Circle",4,5, 2.5));
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add(1,"Alice");
        names.remove(1);
        names.add("Cal");
        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            Object o = i.next();
            System.out.println(o);
        }
    }
}