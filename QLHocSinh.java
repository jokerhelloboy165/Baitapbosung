package Baitapbosung;
import java.util.*;

class QLHocSinh {
    private List<Bai12> dsHocSinh;
    
    public QLHocSinh() {
        this.dsHocSinh = new ArrayList<>();
    }
    
    // Nhap danh sach hoc sinh
    public void nhapDSHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Bai12 hs = new Bai12("", "", 0, 0, 0);
            hs.nhapDL();
            hs.tinhDTB();
            this.dsHocSinh.add(hs);
        }
    }
    
    // Sap xep danh sach hoc sinh theo diem trung binh giam dan
    public void sapXepDSHocSinh() {
        Collections.sort(this.dsHocSinh, new Comparator<Bai12>() {
            @Override
            public int compare(Bai12 hs1, Bai12 hs2) {
                if (hs1.getDiemTB() < hs2.getDiemTB()) {
                    return 1;
                } else if (hs1.getDiemTB() > hs2.getDiemTB()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    
    // Dem so luong hoc sinh co diem trung binh >= x
    public int demHSTBCao(double x) {
        int count = 0;
        for (Bai12 hs : this.dsHocSinh) {
            if (hs.getDiemTB() >= x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        QLHocSinh qlhs = new QLHocSinh();
        qlhs.nhapDSHocSinh();
        qlhs.sapXepDSHocSinh();
        System.out.println("Danh sach hoc sinh sap xep theo diem trung binh:");
        for (Bai12 hs : qlhs.dsHocSinh) {
            System.out.println(hs);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem TB can tim: ");
        double x = sc.nextDouble();
        int count = qlhs.demHSTBCao(x);
        System.out.println("So luong hoc sinh co diem TB >= " + x + ": " + count);
    }
}