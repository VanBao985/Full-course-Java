package Relationships;

import static java.lang.Math.*;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    public double getLength(){
        double k = pow((begin.getX()-end.getX()),2) + pow((begin.getY()-end.getY()),2);
        return sqrt(k);
    }
}
