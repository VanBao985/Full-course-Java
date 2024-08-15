package Inheritance;

public class Studentt extends Person{
    private double gpa;
    public Studentt(String name, int age, String address, double gpa){
        super(name, age, address);
        this.gpa = gpa;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("GPA: " + gpa);
    }
}

class Entryy {
    public static void main(String[] args) {
        Studentt s = new Studentt("Khanh", 23, "Ha Noi", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
        t.display();
    }
}