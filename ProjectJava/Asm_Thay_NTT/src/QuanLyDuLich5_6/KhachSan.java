package QuanLyDuLich5_6;
import java.util.ArrayList;
public class KhachSan {
    private String name;
    private Customer[] kh;
    public static int countHotel = 0;
    public KhachSan(String name){
        this.name = name;
        this.kh = null;
        countHotel++;
    }
    public int statisticHoTel(){
        return countHotel;
    }

    public void addKh(Customer khach) {
        this.kh[kh.length] = khach;
    }
    public Customer[] getdsKhach(){
        return kh;
    }

}
