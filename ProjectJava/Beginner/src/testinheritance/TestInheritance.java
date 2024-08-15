package testinheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Person p1 = new Manager(); // Up-casting
        Employee e = (Employee) p1;  // Down-casting
        Person p2 = new Employee(); //Up casting
        Manager m = (Manager) p2;  // Down-casting
    }
}
