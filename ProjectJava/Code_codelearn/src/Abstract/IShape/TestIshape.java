package Abstract.IShape;

import Abstract.IShape.Circle;
import Abstract.IShape.IShape;
import Abstract.IShape.Rectangle;

public class TestIshape {
    public static void main(String[] args) {
        IShape[] shape = new IShape[2];
        shape[0] = new Rectangle(3.2, 4.5);
        shape[1] = new Circle(3.9);
        for (int i=0; i < 2; i++) {
            System.out.println("Area: " + shape[i].getArea());
            System.out.println("Perimeter: "+ shape[i].getPerimeter());
        }
    }
}
