package inner_class;

public class inner_class {
    public static void main(String[] args) {
        outer obj1 = new outer();
        outer.inner obj2 = obj1. new inner();
        System.out.println(obj2.myx());
    }
}