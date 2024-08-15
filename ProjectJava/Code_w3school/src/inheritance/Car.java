package inheritance;

class Car extends Subclass {
    protected String Volvo="bad";

    public static void main(String[] args) {
        Car obj=new Car();
        System.out.println(obj.BMW);
        obj.name();
        System.out.println(obj.Volvo);
    }
}
