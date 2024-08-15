package Polymorphism;

public class VariableHidingTest{
    public static void main(String[] args) {
        VariableHiding var = new VariableHiding();
        System.out.println(var.x);
        var.display();
        var = new SubclassVa();
        System.out.println(((SubclassVa)var).x);
        var.display();
    }

}
