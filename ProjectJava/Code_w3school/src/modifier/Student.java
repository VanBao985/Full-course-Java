package modifier;

//subclass (inherit from Modifier2)
class Student extends Modifier2 {
    public int graduationYear=2026;

    public void study() {            //the body of void abstract method study is provided in here
        System.out.println("Studying all day long");
    }
}
