package Bai6_1;


class TG1{
    private String name;
    public TG1(String name){}
}
public class HV1 extends TG1 {
//    Error: Not exist default constructor in TG1 class!!
//    public HV1{ }
    public HV1(String name){
        super(name);
    }
    public void test(){}
}
