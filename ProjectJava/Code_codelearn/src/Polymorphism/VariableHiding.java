package Polymorphism;


public class VariableHiding {
    public int x = 10;  // VariableHiding
    public void display(){
        System.out.println("Variable hiding");
    }
}

class SubclassVa extends VariableHiding{
    public int x = 20;
    @Override
    public void display(){
        System.out.println("SubclassVa");
    }
}

