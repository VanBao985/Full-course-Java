package shape_circle_square;


public class Triangle extends Shape {
    private float base;
    private float height;
    public final double PI = 3.14;
    public Triangle(String name, double x, double y, float base, float height){
        super(name, x, y);
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        String s = "Triangle";
        return (0.5f) * base * height;
    }
}
