package tugiac_point;

public class Point_Test {
    public static void tricky(Point p1, Point p2){
        p1.setX(100); p1.setY(100);
//        Point temp = p1;
//        p1 = p2; p2 = temp;
        Point temp = new Point(100,100);
        p1.setX(p2.getX()); p1.setY(p2.getY());
        p2.setX(temp.getX()); p2.setY(temp.getY());
    }

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        p1.printPoint(); p2.printPoint();
        System.out.println();
        tricky(p1, p2);
        p1.printPoint();p2.printPoint();
    }
}

