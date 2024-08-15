package Inheritance;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
