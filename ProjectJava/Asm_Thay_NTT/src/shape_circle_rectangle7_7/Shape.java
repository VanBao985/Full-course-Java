package shape_circle_rectangle7_7;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape (){}
    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
        return "Area & Perimeter: ";
    }
    public void test(String x, String y){
        System.out.println("Shape!");
    }
}
