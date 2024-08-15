package shape_circle_square;


public class Square extends Shape {
    private double side;
    public Square(String name, double x, double y, double side){
        super(name, x, y);
        this.side = side;
    }
    @Override
    public double calculateArea(){
        String s = "Square";
        return side * side;
    }
}
