package Shape_template_wildcard;

public class Circle extends Shape{
    private String name;
    private double radius;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getName() {
        return name;
    }
}
