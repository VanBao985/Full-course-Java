package shape_circle_rectangle7_7;

public class Square extends Rectangle{
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(String name, boolean filled, double side){
        super(name, filled, side, side);
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        super.setWidth(side);
    }
    @Override
    public double getArea() {
        System.out.println("Square!");
        return super.getArea();
    }
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
    @Override
    public String toString() {
        return super.toString();
    }


    public void test(int x) {
        System.out.println("Square!");
    }
}
