package Inheritance;

public class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: " + age);
        System.out.println("Address: "+ address);
    }
}
