package Bai6_1;


class TG2{
    private String name;
    public TG2(String name){

    }
}
public class HV2 extends TG2{
    // Error: Not exist constructor
    public HV2 (String name){
        super(name);
    }
    public void test(){}
}
