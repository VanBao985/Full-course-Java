package QuanLyDuLich5_6;
import java.util.*;
import java.sql.*;

public class Entry {
    public static void main(String[] args) {
        Customer[] cust = new Customer[3];
        cust[1] = new Customer("Bao", "Nam");
        cust[0] = new Customer("Linh", "Nu");
        cust[2] = new Customer("Dung", "Nu");
        KhachSan[] khachSans = new KhachSan[3];
        khachSans[0] = new KhachSan("Hoa hong tinh yeu");
        khachSans[1] = new KhachSan("Lau dai tinh ai ");
        khachSans[2] = new KhachSan("Hoang Mai Hotel");
        DiaDiem[] diaDiems = new DiaDiem[3];
        diaDiems[1] = new DiaDiem("Ha Noi");
        diaDiems[2] = new DiaDiem("Nghe An");
        diaDiems[0] = new DiaDiem("TP HCM");
        TourDuLich[] tour = new TourDuLich[2];
        tour[0] = new TourDuLich(cust[0], diaDiems[0], khachSans[0]);

        tour[1] = new TourDuLich(cust[0], diaDiems[2], khachSans[1]);

    }

}
