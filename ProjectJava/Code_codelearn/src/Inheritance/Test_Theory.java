package Inheritance;

import com.sun.tools.javac.Main;

class Test_Theory{
    public static void main(String[] args) {
        Student s1 = new Student("Hai", 1999, 8.8);
//        System.out.println(s1.getName());
//        System.out.println(s1.getDob());
//        System.out.println(s1.getGPA());
        s1.display();
    }
}