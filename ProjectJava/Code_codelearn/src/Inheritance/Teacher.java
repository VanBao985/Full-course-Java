package Inheritance;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, int age, String address, int salary){
        super(name, age, address);
        this.salary = salary;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Salary: "+ salary);
    }
}
