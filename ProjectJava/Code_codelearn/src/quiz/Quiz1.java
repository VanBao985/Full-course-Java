package quiz;

class A {

    public int x = 10;
    public void display() {
        System.out.println(this.x);
    }
}

class B extends A {

    public int x = 20;
}

public class Quiz1 {

    public static void main(String[] args) {
        // Biến của A tham chiếu tới lớp con B
        A b = new B();
        // Gọi ra phương thức ở lớp A
        b.display();
    }
}