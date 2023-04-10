package Baitapbosung;
import java.util.*;

class XeMay {
    public String soMay;
    public String soKhung;
    public String hangSX;
    public String mauXe;
    public int giaThanh;
    
    public XeMay() {
    	
    }

    // Toán tử tạo lập
    public XeMay(String soMay, String soKhung, String hangSX, String mauXe, int giaThanh) {
        this.soMay = soMay;
        this.soKhung = soKhung;
        this.hangSX = hangSX;
        this.mauXe = mauXe;
        this.giaThanh = giaThanh;
    }

    // Phương thức nhập thông tin xe máy
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so may: ");
        soMay = sc.nextLine();
        System.out.print("Nhap so khung: ");
        soKhung = sc.nextLine();
        System.out.print("Nhap hang san xuat: ");
        hangSX = sc.nextLine();
        System.out.print("Nhap mau xe: ");
        mauXe = sc.nextLine();
        System.out.print("Nhap gia thanh: ");
        giaThanh = sc.nextInt();
    }

    // Phương thức hiển thị thông tin xe máy
    public void hienThi() {
        System.out.println("Thong tin xe may:");
        System.out.println("So may: " + soMay);
        System.out.println("So khung: " + soKhung);
        System.out.println("Hang SX: " + hangSX);
        System.out.println("Mau xe: " + mauXe);
        System.out.println("Gia thanh: " + giaThanh);
    }
    
    // Phương thức trả về giá thành của xe máy
    public int getGiaThanh() {
        return giaThanh;
    }
}
    
class QLXeMay extends XeMay{
    public XeMay dsXe[];
    public int soXe;

    // Phương thức nhập danh sách các xe máy
    public void nhapDS() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Nhap so xe may: ");
    	soXe = sc.nextInt();
    	dsXe = new XeMay[soXe];
    	
        for (int i = 0; i < soXe; i++) {
            System.out.println("Nhap thong tin xe may " + (i+1) + ":");
            System.out.println("-----------------------------------");
            dsXe[i] = new XeMay();
            dsXe[i].nhapDL();	
        }
    }

    // Phương thức hiển thị thông tin về danh sách các xe máy
    public void hienThiDS() {
        System.out.println("Danh sách xe máy:");
        for (int i = 0; i < soXe; i++) {
            System.out.println("-----------------------------------");
            dsXe[i].hienThi();
        }
    }
    
    public void timXeGiaCaoNhat() {
        double maxGia = dsXe[0].getGiaThanh();
        int c = 0;

        for (int i = 0; i < soXe; i++) {
            if (dsXe[i].getGiaThanh() > maxGia) {
                maxGia = dsXe[i].getGiaThanh();
                c = i;
            }
        }

        System.out.println("Thong tin xe may co gia thanh cao nhat:");
        dsXe[c].hienThi();
    }
}

public class Bai13 {
public static void main(String[] args) {
QLXeMay qlxm = new QLXeMay();
qlxm.nhapDS();
qlxm.hienThiDS();
qlxm.timXeGiaCaoNhat();
}
}


