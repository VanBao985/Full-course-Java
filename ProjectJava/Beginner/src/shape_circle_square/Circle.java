package shape_circle_square;


import java.awt.Graphics;


public class Circle extends Shape implements Actable{
    private double radius;
    public final double PI = 3.14;
    public Circle(String name, double x, double y, double radius){
        super(name, x, y);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return radius * radius * PI;
    }
    @Override
    public void moveTo(Graphics g, int x, int y) {
        System.out.println("");
    }
    @Override
    public void draw(Graphics g) {
        System.out.println("Draw Circle at x = " + x + ", y = " + y);
        g.drawOval((int)(x-radius), (int)(y - radius), (int)(2 * radius), (int)(2 * radius));
    }

    @Override
    public void erase(Graphics g) {
        System.out.println("Erase Circle at x = "+ x + ", y = " + y);

    }
}
