package polymorphism;
public class Polymorphism {
    public void animalSound(){
        System.out.println("The animal make sound");
    }
}

class Dog extends Polymorphism{
    public void animalSound(){
        System.out.println("Dog: go go ");
    }
}

class Cat extends Polymorphism{
    public void animalSound(){
        System.out.println("Cat: Meow meow");
    }
}

class Pig extends Polymorphism{
    public void animalSound(){
        System.out.println("Pig: hok hok");
    }
}

