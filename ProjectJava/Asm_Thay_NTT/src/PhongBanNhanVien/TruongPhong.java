package PhongBanNhanVien;

public class TruongPhong extends NhanVien{
    private double phuCap;
    private double soNamDuongChuc;
    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, double soNamDuongChuc){
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    @Override
    public double tinhLuong(){
        return LUONG_CO_BAN * heSoLuong + phuCap;
    }
    @Override
    public void inTTin(){
        System.out.println("Truong phong:" + tenNhanVien +": "+heSoLuong);
    }

}
