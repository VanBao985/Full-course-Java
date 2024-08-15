package polymorphism;

class Main {
    public static void main(String[] args) {
        Polymorphism animal=new Polymorphism();
        Polymorphism Cat=new Cat();
        Polymorphism Pig=new Pig();
        Polymorphism Dog=new Dog();
        animal.animalSound();
        Cat.animalSound();
        Pig.animalSound();
        Dog.animalSound();
    }
}
