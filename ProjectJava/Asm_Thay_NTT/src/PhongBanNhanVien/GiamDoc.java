package PhongBanNhanVien;

public class GiamDoc extends NhanVien implements QuanLy{
    private double phuCap;
    public static double loiNhuanCongTy;
    public GiamDoc(String tenNhanVien, double heSoLuong, double phuCap){
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }
    @Override
    public double tinhHoaHong(){
        return 5 * loiNhuanCongTy / 100;
    }
    @Override
    public double tinhLuong(){
        return LUONG_CO_BAN * heSoLuong + phuCap + tinhHoaHong();
    }
    @Override
    public void inTTin(){
        System.out.println("Giam Doc" + tenNhanVien +": " + heSoLuong);
    }

}
