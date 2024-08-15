package Shape_template_wildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Entry <T extends Shape>{
    private ArrayList<T> shapes = new ArrayList<>();
    Comparator<T> comparator = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            if (o1.getArea() > o2.getArea()){
                return 1;
            }
            else{
                if (o1.getArea() < o2.getArea()) return -1;
                else return 0;
            }
        }
    };
    public void sortArea(ArrayList<T> shapes){
        Collections.sort(shapes, comparator);
    }
    Comparator<T> comparator2 = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };
    public void sortName(ArrayList<T> shapes){
        Collections.sort(shapes,comparator2);
    }
    public void printSorted(ArrayList<T> shapes){
        for (Iterator<T> i = shapes.iterator(); i.hasNext();){
            T shape = i.next();
            System.out.println(shape.getName() +" " + shape.getArea());
        }
    }
}
