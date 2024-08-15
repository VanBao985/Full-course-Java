package Student_Class_DiemThi;
import java.util.*;

//import static Student_Class_DiemThi.Test.*;

public class LopHoc {
    private Student[] StudentList;

    public void setStudentList(Student[] StudentList) {
        this.StudentList = StudentList;
    }

    public Student[] getStudentList() {
        return StudentList;
    }

    static Scanner scan = new Scanner(System.in);
    static Random rd = new Random();

    // Xây dựng ham random cho tên (kiểu string)
    public static String generateRandomString(int length) {
        String characters = "ABCDEFJHIJKLMNOPQRSTUVWYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = rd.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public LopHoc(int n) {
        Student[] temp = new Student[n];
        setStudentList(temp);
        for (int i = 0; i < n; i++) {
            String name = generateRandomString(5);
            int year = rd.nextInt(2006 + 1996);
            this.StudentList[i] = new Student(name, year);
        }
    }

    public LopHoc() {
        System.out.println("Input: ");
        int N = scan.nextInt();
        Student[] temp = new Student[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input Information Student: " + i + 1);
            System.out.println("Get Name: ");
            String name = scan.next();
            System.out.println("Get Year: ");
            int year = scan.nextInt();
            temp[i] = new Student(name, year);
        }
        setStudentList(temp);
    }

    public void swapStudent(Student a, Student b) {
        Student temp = new Student();
        temp.setName(a.getName());
        temp.setYear(a.getYear());
        temp.setPoint(a.getPoint());
        a.setName(b.getName());
        a.setYear(b.getYear());
        a.setPoint(b.getPoint());
        b.setName(temp.getName());
        b.setYear(temp.getYear());
        b.setPoint(temp.getPoint());
    }

    public void sortPoint(Student[] st, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (st[i].getPoint() > st[j].getPoint())
                    swapStudent(st[i], st[j]);
            }
        }
    }

    public void sortYear(Student[] st, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (st[i].getYear() > st[j].getYear())
                    swapStudent(st[i], st[j]);
            }
        }
    }

    // tạo get year, get name, get point cho st[i]
//    public String getStudentListName(int i){
//        return StudentList[i].getName();
//    }
//    public int getStudentListYear ( int i){
//        return StudentList[i].getYear();
//    }
//    public double getStudentListPoint (int i){
//        return StudentList[i].getPoint();
//    }
    public void printStudentListPoint() {
        sortPoint(StudentList, StudentList.length);
        ArrayList<Student> clsStd = new ArrayList<>(Arrays.asList(StudentList));
        Test.inDiemThi(StudentList.length, clsStd);
    }

    public void printStudentListYear() {
        sortYear(this.StudentList, this.StudentList.length);
        ArrayList<Student> clsStd = new ArrayList<>(Arrays.asList(StudentList));
        Test.inDiemThi(StudentList.length, clsStd);
    }
    public double sumPointOop (int n){
        double sumPoint = 0;
        for (int i = 0; i < n; i++) {
            sumPoint += StudentList[i].getPoint();
        }
        return sumPoint;
    }
    public double averagePointOop (int n){
        double averagePoint = 0;
        for (int i = 0; i < n; i++) {
            averagePoint += StudentList[i].getPoint();
        }
        averagePoint = averagePoint/n;
        return averagePoint;
    }
}

