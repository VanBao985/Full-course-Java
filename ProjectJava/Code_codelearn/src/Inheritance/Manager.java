package Inheritance;

public class Manager extends Employee{
    private int bonus;
    public Manager(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public int getSalary(){
        return super.getSalary()+ bonus;
    }
    @Override
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: "+ getSalary());
    }
}
