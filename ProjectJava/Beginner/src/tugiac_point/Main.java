package tugiac_point;

public class Main {
    public static void main(String[] args) {
        TuGiac hinhVuong = (HinhVuong) new HinhVuong();
        hinhVuong.printTuGiac();
        hinhVuong.caculateArea();
        ((HinhVuong) hinhVuong).checkRectangle();
//        Point p1 = new Point(3,3);
//        Point p2 = new Point(4,4);
//        Point p3 = new Point();
//        Point p4 = new Point(6,6);
//        TuGiac tuGiac1 = new TuGiac(p1, p2, p3, p4);
//        TuGiac tuGiac2 = new TuGiac();
//        tuGiac1.printTuGiac();
//        tuGiac2.printTuGiac();
    }
}
