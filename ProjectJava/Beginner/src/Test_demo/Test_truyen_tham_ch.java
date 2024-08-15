package Test_demo;

public class Test_truyen_tham_ch {
    public static void ResetYear(Truyen_tham_chieu obj){
        obj = new Truyen_tham_chieu("Bao", 2000); // tạo 1 obj mới
    }

    public static void main(String[] args) {
        Truyen_tham_chieu obj = new Truyen_tham_chieu("Van Bao", 2004);
        Test_truyen_tham_ch test = new Test_truyen_tham_ch();
        ResetYear(obj);
        System.out.println(obj.getYear());
    }
}
