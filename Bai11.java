package Baitapbosung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KhachHang {
String ma;
String ten;
int tuoi;
String diaChi;
String sdt;
String email;
public KhachHang() {}

public KhachHang(String ma, String ten, int tuoi, String diaChi, String sdt, String email) {
this.ma = ma;
this.ten = ten;
this.tuoi = tuoi;
this.diaChi = diaChi;
this.sdt = sdt;
this.email = email;
}
public void nhapKhachHang() {
Scanner sc = new Scanner(System.in);
System.out.print("Nhap ma khach hang: ");
ma = sc.nextLine();
System.out.print("Nhap ten khach hang: ");
ten = sc.nextLine();
System.out.print("Nhap tuoi khach hang: ");
tuoi = Integer.parseInt(sc.nextLine());
System.out.print("Nhap dia chi lien he: ");
diaChi = sc.nextLine();
System.out.print("Nhap so dien thoai: ");
sdt = sc.nextLine();
System.out.print("Nhap email: ");
email = sc.nextLine();
}
public void hienThiKhachHang() {
System.out.println("Ma khach hang: " + ma);
System.out.println("Ten khach hang: " + ten);
System.out.println("Tuoi khach hang: " + tuoi);
System.out.println("Dia chi lien he: " + diaChi);
System.out.println("So đien thoai: " + sdt);
System.out.println("Email: " + email);
}
}
class QLKhachHang {
ArrayList<KhachHang> danhSachKhachHang;
public QLKhachHang() {
danhSachKhachHang = new ArrayList<>();
}
public void nhapDanhSachKhachHang() {
Scanner sc = new Scanner(System.in);
System.out.print("Nhap so luong khach hang: ");
int n = Integer.parseInt(sc.nextLine());
for (int i = 0; i < n; i++) {
KhachHang khachHang = new KhachHang();
khachHang.nhapKhachHang();
danhSachKhachHang.add(khachHang);
}
}
public void sapXepKhachHangTheoTuoi() {
Collections.sort(danhSachKhachHang, (kh1, kh2) -> kh2.tuoi - kh1.tuoi);
}
public void hienThiKhachHangTheoTen(String ten) {
for (KhachHang khachHang : danhSachKhachHang) {
if (khachHang.ten.equalsIgnoreCase(ten)) {
khachHang.hienThiKhachHang();
}
}
}
}
public class Bai11 {
public static void main(String[] args) {
QLKhachHang qlkh = new QLKhachHang();
qlkh.nhapDanhSachKhachHang();
qlkh.sapXepKhachHangTheoTuoi();
qlkh.hienThiKhachHangTheoTen("Nguyen Van Duc");
}
}

