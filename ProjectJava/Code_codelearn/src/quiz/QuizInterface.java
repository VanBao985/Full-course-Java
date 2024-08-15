package quiz;

interface Ishape1 {

    double primeter();
}

interface Ishape2 {

    double area();
}

class Rectangle2 implements Ishape1, Ishape2 {
    private int h;
    private int w;
    public Rectangle2(int h, int w)
    {
        this.h = h;
        this.w = w;
    }
    public double primeter()
    {
        return (w+h)*2;
    }
    public double area()
    {
        return w*h;
    }
}

public class QuizInterface {

    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(2,3);
        System.out.println("Primeter = "+r.primeter());
        System.out.println("Area = "+r.area());
    }
}
