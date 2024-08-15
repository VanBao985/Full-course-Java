package PhongBanNhanVien;

public class NhanVien {
    protected String tenNhanVien;
    protected double heSoLuong;
    public static double LUONG_CO_BAN = 750;
    public final double LUONG_MAX = 20000;
    public NhanVien (String tenNhanVien, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public boolean tangLuong(double heSoLuong){
        this.heSoLuong = heSoLuong;
        return true;
    }
    public double tinhLuong(){
        double luong = heSoLuong * LUONG_CO_BAN;
        if (luong < LUONG_MAX) return luong;
        else return LUONG_MAX;
    }
    public void inTTin(){
        System.out.println(tenNhanVien +": "+heSoLuong);
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien=tenNhanVien;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong=heSoLuong;
    }
}

