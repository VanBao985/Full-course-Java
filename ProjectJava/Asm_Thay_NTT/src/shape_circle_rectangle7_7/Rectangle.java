package shape_circle_rectangle7_7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length=length;
    }

    public void setWidth(double width) {
        this.width=width;
    }
    @Override
    public double getArea() {
        System.out.println("Rectangle!");
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
    @Override
    public String toString() {
        return super.toString() + getArea() + ", "+ getPerimeter();
    }

    public void test(String x) {
        System.out.println("Rectangle!");
    }
}
