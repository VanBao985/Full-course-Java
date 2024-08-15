package shape_circle_rectangle7_7;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.test("Object-oriented programming");
        Shape shape = new Square();
        Rectangle rectangle = (Rectangle) shape;
        Circle circle = (Circle) shape;
        }

}
