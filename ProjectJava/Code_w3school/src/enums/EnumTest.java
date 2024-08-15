package enums;

public class EnumTest {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
        for (Level myVar1 : Level.values()){
            System.out.println(myVar1);
        }
    }
}
