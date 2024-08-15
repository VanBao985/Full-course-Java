package Abstract.Theory;

public interface TheoryInterface {
    public static final int n = 4;
    public abstract void move();
}
interface Ianimal{
    public abstract void sound();
}

class Cats implements Ianimal, TheoryInterface{
    @Override
    public void move(){
        System.out.println("go ahead 5 meters");
    }
    @Override
    public  void sound(){
        System.out.println("meow meow");
    }
}

class  Entryy{
    public static void main(String[] args) {
        Cats obj = new Cats();
        obj.move();
        obj.sound();
    }
}