package Student_Class_DiemThi;
import java.util.*;

class Test {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input:");
        int N = scan.nextInt();
        scan.nextLine();
        // Dùng ArrayList để tạo và quản lý 1 mảng sinh viên
        ArrayList<Student> classStudent = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Name: ");
            String name = scan.next();
            System.out.println("Year: ");
            int year = scan.nextInt();
            Student st = new Student(name, year);
            classStudent.add(st);  //add vào ArrayList
        }
        toChucThi(N, classStudent);
        System.out.println("Output: ");
        inDiemThi(N, classStudent);
        System.out.println();
        System.out.println("Count objects: " + Student.count);
    }

    public static void toChucThi(int n, ArrayList<Student> classStudent) {
        // Cách select ra một phần tử 1 phần tử của ArrayList
        if (n == 0) classStudent.getFirst().lamBaiThi();
        else {
            Random rd = new Random();
            for (int i = 0; i < n; i++) {
                int num = rd.nextInt(3);
                switch (num) {
                    case 0:
                        System.out.println(classStudent.get(i).getName());
                        System.out.println("Select mothod " + num);
                        classStudent.get(i).lamBaiThi();
                        break;
                    case 1:
                        System.out.println(classStudent.get(i).getName());
                        System.out.println("Input seed: ");
                        long seed = scan.nextLong();
                        classStudent.get(i).lamBaiThi(seed);
                        break;
                    case 2:
                        System.out.println(classStudent.get(i).getName());
                        System.out.println("Select mothod " + num);
                        if (i == 0)
                            classStudent.get(i).lamBaiThi(classStudent.get(i + 1));
                        if (i == n - 1)
                            classStudent.get(i).lamBaiThi(classStudent.get(i - 2));
                        if ((0 < i) && i < (n - 1)) {
                            double p1 = classStudent.get(i - 1).getPoint();
                            double p2 = classStudent.get(i + 1).getPoint();
                            classStudent.get(i).lamBaiThi(p1+p2);
                        }
                }
            }
        }
    }

    public static void inDiemThi(int n, ArrayList<Student> classStudent) {

        for (int i = 0; i < n; i++) {
            classStudent.get(i).inDiemThi();
        }
    }
}
