package Inheritance;

public class override_theory{
    private String name;
    private String gender;
    public override_theory(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Subclass extends override_theory{
    private int Salary;
    public Subclass(String name, String gender, int Salary){
        super(name,gender);
        this.Salary = Salary;
    }

    public void display(){
        super.display();
        System.out.println("Salary: "+ Salary);
    }
}

class Test_override {
    public static void main(String[] args) {
        Subclass obj = new Subclass("Trung", "Male", 1700);
        obj.display();
    }
}

