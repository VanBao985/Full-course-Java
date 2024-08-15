package Shape_template_wildcard;

public class Rectangle extends Shape{
    private String name;
    private double length;
    private double width;
    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }

    public String getName() {
        return name;
    }
}
