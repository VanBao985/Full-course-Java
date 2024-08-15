package PhongBanNhanVien;

public class TestPhongBan {
    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[3];
        nv[0] = new NhanVien("VanBao",30);
        nv[1] = new NhanVien("VanCao",17.1);
        nv[2] = new NhanVien("VanNghia",26.2);
        PhongBan phong1 = new PhongBan();
        phong1.inTTin();
        boolean tangLuongnv = nv[0].tangLuong(39);
        tangLuongnv = nv[1].tangLuong(27.5);
        boolean themNV = phong1.themNV(nv);
        phong1.inTTin();
//        phong1.xoaNV();
//        phong1.inTTin();
    }
}
