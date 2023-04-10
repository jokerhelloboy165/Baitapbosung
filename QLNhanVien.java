package Baitapbosung;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class QLNhanVien {
    private int soLuongNhanVien;
    private Bai14[] danhSachNhanVien;

    public QLNhanVien() {
        soLuongNhanVien = 0;
        danhSachNhanVien = new Bai14[100];
    }

    public void nhapDanhSachNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        soLuongNhanVien = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i+1));
            Bai14 nv = new Bai14();
            nv.nhapDL();
            danhSachNhanVien[i] = nv;
        }
    }

    public void hienThiDanhSachNhanVien() {
        System.out.println("Danh sách nhân viên:");
        for (Bai14 nv : danhSachNhanVien) {
            nv.hienThi();
        }
    }
    
    public void sapXepDanhSachNhanVienTheoTongLuongGiamDan() {
    	
        // Sắp xếp danh sách theo thứ tự giảm dần của tổng lương
        Arrays.sort(danhSachNhanVien, new Comparator<Bai14>() {
            @Override
            public int compare(Bai14 nv1, Bai14 nv2) {
                return (int) (nv2.tinhTongLuong() - nv1.tinhTongLuong());
            }
        });

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tổng lương giảm dần:");
        for (Bai14 nv : danhSachNhanVien) {
            nv.hienThi();
        }
    }
    
    public void hienThiDanhSachNhanVienNghiHuu() {
        System.out.println("Danh sách nhân viên sắp đến tuổi nghỉ hưu:");
        for (Bai14 nv : danhSachNhanVien) {
            if (nv.getGioiTinh().equals("Nam") && nv.getTuoi() > 55) {
                nv.hienThi();
            } else if (nv.getGioiTinh().equals("Nữ") && nv.getTuoi() > 50) {
                nv.hienThi();
            }
        }
    }
  
    public static void main(String[] args) {
        QLNhanVien qlnv = new QLNhanVien();
        qlnv.nhapDanhSachNhanVien();
        qlnv.hienThiDanhSachNhanVien();
        qlnv.sapXepDanhSachNhanVienTheoTongLuongGiamDan();
        qlnv.hienThiDanhSachNhanVienNghiHuu();
    }
}