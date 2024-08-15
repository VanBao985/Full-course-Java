package Abstract.Theory;

public abstract class Theory {
    public abstract void sound();
    public void display(){
        System.out.println("Run!!");
    }
}

class Cat extends Theory{
    @Override
    public void sound(){
        System.out.println("meow meow");
    }
}
class Dog extends  Theory{
    @Override
    public  void sound(){
        System.out.println("gow gow");
    }
}

class Entry{
    public static void main(String[] args) {
        Theory obj = new Cat();
        obj.sound();
        obj = new Dog();
        obj.sound();
    }
}