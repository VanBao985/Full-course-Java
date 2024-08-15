package shape_circle_square;

public abstract class Shape {
    protected String name;
    protected double x, y;
    public Shape(String name, double x, double y){
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double calculateArea();
}
