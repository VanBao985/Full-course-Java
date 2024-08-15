package Inheritance;

public class ToString {
    private String name;
    private String address;
    private double gpa;
    private int point;
    public ToString(String name, String address, double gpa, int point){
        this.name = name;
        this.address = address;
        this.gpa = gpa;
        this.point=point;
    }
    @Override
    public String toString(){
        String s = "Name: " + name + ", address: " + address + ", GPA: "+ gpa;
        return s;
    }
}
