package Student_Class_DiemThi;

import java.text.*;
import  java.util.*;

public class Student{
    private String name;
    private int year;
    private double Point;
    public static int count = 0;
    public Student(){   count++; }
    public Student(String name, int year){
        this.name = name;
        this.year = year;
        Point = 0;
        count++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public double getPoint() {
        return Point;
    }
    public void setPoint(double point) {
        Point = point;
    }
//    public void set(String name, int year){
//        this.name = name;
//        this.year = year;
//    }
    Random rd = new Random();
    public void lamBaiThi(){
        this.Point = rd.nextDouble(10.0 + 0.0);
    }
    public void lamBaiThi(long seed){
        Point = rd.nextLong(seed);
    }
    public void lamBaiThi(Student bankeben){
        double Point1 = (bankeben.Point)/2;
        lamBaiThi();
        this.Point = (this.Point + Point1) / 2;
    }
    public void lamBaiThi(double Point){
        lamBaiThi();
        this.Point = (this.Point + Point)/2;
    }
        DecimalFormat df = new DecimalFormat("#.##");
    public void inDiemThi(){
        System.out.println(this.name+", "+this.year+"  : "+df.format(this.Point));
    }
}
