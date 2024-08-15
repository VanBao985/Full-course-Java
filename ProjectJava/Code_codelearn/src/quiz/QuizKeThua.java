package quiz;

class A2 {

    public A2() {
        System.out.print("A");
    }
}

class B2 extends A2 {

    public B2() {
        super();
        System.out.print("B");
    }
}

public class QuizKeThua {
    public static void test(B2 b) {
    }

    public static void main(String[] args) {
        B2 b = new B2();
        test(b);
    }
}
