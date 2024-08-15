package tugiac_point;

class TuGiac {
    protected Point[] points = new Point[4];
    public TuGiac(Point d1, Point d2, Point d3, Point d4){
        points[0] = d1; points[1] = d2;
        points[2] = d3; points[3] = d4;
    }
    public TuGiac(){
        points[0] = new Point();
        points[1] = new Point(1,1);
        points[2] = new Point(4,5);
        points[3] = new Point(3,3);
    }
    public void printTuGiac(){
        System.out.println(points[0].getX()+","+points[0].getY()+" "+points[1].getX() +","+points[1].getY());
    }
    public void caculateArea(){
    }
}

