package shape_circle_rectangle7_7;

public class Circle extends Shape{
    protected double radius;
    public final double PI = 3.14;
    public Circle(){}
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return radius * radius * PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }
    @Override
    public String toString() {
        return super.toString() + getArea() + ", "+ getPerimeter();
    }

    public void test(int x, String y) {
        System.out.println("Circle!");
    }
}
