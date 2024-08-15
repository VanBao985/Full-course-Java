package Inheritance;

class Theory{
    private String name;
    private int dob;
    public Theory (String name, int dob){
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getDob() {
        return dob;
    }
    public void display(){
        System.out.println("Theory display method called.");
    }
    public final void output(){ // not Override
        System.out.println("Output. ");
    }
}

class Student extends Theory{
    private double GPA;
    public Student(String name, int dob, double GPA) {
        super(name, dob);
        this.GPA=GPA;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Student display method called.");
    }
    public double getGPA() {
        return GPA;
    }
}