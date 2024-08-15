package Relationships;
import java.util.*;
public class PolyLine {
    private List<Point> points = new ArrayList<>();
    //List: chú ý cú pháp tạo List, các thao tác với List
    public PolyLine(){
    }
    public PolyLine(List<Point> points){
        this.points = points;
    }
    public void appendPoint(Point point){
        points.add(point);
    }
    public void appendPoint(int x, int y){
        Point point = new Point(x, y);
        points.add(point);
    }
    public double getLength(){
        double length = 0;
        double lengthX, lengthY;
        for (int i=1; i < points.size(); i++) {
            lengthX = Math.pow((points.get(i).getX() - points.get(i-1).getX()),2);
            lengthY = Math.pow((points.get(i).getY() - points.get(i-1).getY()),2);
            length += Math.sqrt(lengthX+lengthY);
        }
        return length;
    }
    public void getPolyLine(){
        for (int i=0; i < points.size(); i++) {
            System.out.println(points.get(i).getX() + "  " +points.get(i).getY());
        }
    }
}
