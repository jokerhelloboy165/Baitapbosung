package Baitapbosung;
import java.util.*;

public class Bai12 {
    private String hoTen;
    private String lop;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;
    
    // Constructor
    public Bai12(String hoTen, String lop, double diemToan, double diemLy, double diemHoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    // Nhap du lieu cho mot hoc sinh
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap lop: ");
        this.lop = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        this.diemToan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        this.diemLy = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        this.diemHoa = sc.nextDouble();
    }
    
    // Tinh diem trung binh
    public void tinhDTB() {
        this.diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
    }
    
    public double getDiemTB() {
        return this.diemTB;
    }
    
    public String toString() {
        return this.hoTen + " - " + this.lop + " - Diem TB: " + this.diemTB;
    }
}

//Phai xay dung rieng class QLHocSinh