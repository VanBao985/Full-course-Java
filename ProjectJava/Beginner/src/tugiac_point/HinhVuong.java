package tugiac_point;

class HinhVuong extends TuGiac{
    public HinhVuong(){
        super();
    }
    // Get Area
    @Override
    public void caculateArea(){
        double a = Math.sqrt(Math.pow((points[0].getX()-points[1].getX()),2)+Math.pow((points[0].getY()-points[1].getY()),2));
        double b = Math.sqrt(Math.pow((points[0].getX()-points[3].getX()),2)+Math.pow((points[0].getY()-points[3].getY()),2));
        System.out.println(a*b);
    }
    // Check Rectangle
    public void checkRectangle(){
        return;
    }
}

