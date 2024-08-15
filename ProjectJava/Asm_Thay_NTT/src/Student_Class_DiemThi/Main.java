package Student_Class_DiemThi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.*;

class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cach input sinh vien: 0: 'Input/ 1:Random' ");
        int num = scan.nextInt();   // 0 or 1
        LopHoc cls;
        if (num == 0) {
            cls = new LopHoc();
        } else {
            System.out.println("Input dssv: ");
            int n = scan.nextInt();
            cls = new LopHoc(n);
        }
        ArrayList<Student> clsStd = new ArrayList<>(Arrays.asList(cls.getStudentList()));

        Test.toChucThi(cls.getStudentList().length, clsStd);
        System.out.println();
        cls.printStudentListYear();
        System.out.println();
        cls.printStudentListPoint();
        System.out.println("Input slsv tinh diem: ");
        int n = scan.nextInt();
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sum of Point_OOP: ");
        System.out.println(df.format(cls.sumPointOop(n)));
        System.out.println("Average Point_OOP of all Student: ");
        System.out.println(df.format(cls.averagePointOop(cls.getStudentList().length)));
    }

}


