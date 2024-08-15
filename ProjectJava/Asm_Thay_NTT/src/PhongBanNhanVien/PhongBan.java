package PhongBanNhanVien;

import java.util.Stack;
public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public final byte SO_NV_MAX = 100;
    Stack<NhanVien> nhanVienStack = new Stack<>();
    public boolean themNV(NhanVien... nhanvien){
        for (int i=0; i < nhanvien.length; i++) {
            nhanVienStack.push(nhanvien[i]);
        }
        return true;
    }
    public void xoaNV(){
        nhanVienStack.pop();
    }
    public double tongLuong(){
        Stack<NhanVien> temp = nhanVienStack;
        double luong = 0;
        while(!temp.isEmpty()){
            luong += temp.peek().tinhLuong();
            temp.pop();
        }
        return luong;
    }
    public void inTTin(){
        Stack<NhanVien> temp = nhanVienStack;
        System.out.println("Tong Luong: " + tongLuong());
        while(!temp.isEmpty()) {
            temp.peek().inTTin();
            temp.pop();
        }
    }
}
