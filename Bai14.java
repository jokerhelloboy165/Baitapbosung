package Baitapbosung;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Bai14 {
	String hoTen;
    String gioiTinh;
    double heSoLuong;
    String chucVu;
    double phuCap;
    double tongLuong;
    Calendar ngaySinh;


    public Bai14() {
    }
    
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Bai14(String hoTen, String gioiTinh, double heSoLuong, String chucVu, double phuCap) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.heSoLuong = heSoLuong;
        this.chucVu = chucVu;
        this.phuCap = phuCap;
    }

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap chuc vu: ");
        chucVu = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        String ngaySinhStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh = Calendar.getInstance();
            ngaySinh.setTime(sdf.parse(ngaySinhStr));
        } catch (ParseException e) {
            System.out.println("Nhap sai dinh dang ngay sinh!");
        }
    }
    

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Phu cap: " + phuCap);
        System.out.println("Tong luong: " + tongLuong);
    }

    public void tinhPhuCap() {
        switch (chucVu) {
            case "Giam doc":
                phuCap = 500000;
                break;
            case "Pho giam doc":
                phuCap = 300000;
                break;
            case "Truong phong":
                phuCap = 200000;
                break;
            case "Pho phong":
                phuCap = 100000;
                break;
            default:
                phuCap = 50000;
        }
    }

    public void tinhTongLuong() {
        tinhPhuCap();
        tongLuong = 31000 * heSoLuong + phuCap;
    }
    
    public int getTuoi() {
        Calendar now = Calendar.getInstance();
        int tuoi = now.get(Calendar.YEAR) - ngaySinh.get(Calendar.YEAR);
        if (now.get(Calendar.MONTH) < ngaySinh.get(Calendar.MONTH)) {
            tuoi--;
        } else if (now.get(Calendar.MONTH) == ngaySinh.get(Calendar.MONTH)
                && now.get(Calendar.DAY_OF_MONTH) < ngaySinh.get(Calendar.DAY_OF_MONTH)) {
            tuoi--;
        }
        return tuoi;
    }

}
//Phai tach rieng phan QLNhanVien