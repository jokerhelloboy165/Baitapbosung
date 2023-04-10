package Baitapbosung;
import java.util.Scanner;

public class Bai10MaTranVuong {
    private int n;
    private float[][] A;

    public Bai10MaTranVuong(int n) {
        this.n = n;
        A = new float[n][n];
    }

    public void nhapDL() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap gia tri phan tu A[%d][%d]: ", i, j);
                A[i][j] = scanner.nextFloat();
            }
        }
    }

    public void hienThi() {
        System.out.println("Ma tran vuong A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static Bai10MaTranVuong congMT(Bai10MaTranVuong mt1, Bai10MaTranVuong mt2) {
        if (mt1.n != mt2.n) {
            throw new IllegalArgumentException("Hai ma tran khong cung cap!");
        }

        Bai10MaTranVuong ketQua = new Bai10MaTranVuong(mt1.n);

        for (int i = 0; i < mt1.n; i++) {
            for (int j = 0; j < mt1.n; j++) {
                ketQua.A[i][j] = mt1.A[i][j] + mt2.A[i][j];
            }
        }

        return ketQua;
    }

    public static Bai10MaTranVuong nhanMT(Bai10MaTranVuong mt1, Bai10MaTranVuong mt2) {
        if (mt1.n != mt2.n) {
            throw new IllegalArgumentException("Hai ma tran khong cung cap!");
        }

        Bai10MaTranVuong ketQua = new Bai10MaTranVuong(mt1.n);

        for (int i = 0; i < mt1.n; i++) {
            for (int j = 0; j < mt1.n; j++) {
                float sum = 0;
                for (int k = 0; k < mt1.n; k++) {
                    sum += mt1.A[i][k] * mt2.A[k][j];
                }
                ketQua.A[i][j] = sum;
            }
        }

        return ketQua;
    }
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Nhap so cap cua ma tran: ");
int n = scanner.nextInt();

// Tạo ma trận vuông
Bai10MaTranVuong mt = new Bai10MaTranVuong(n);

// Nhập giá trị cho ma trận
mt.nhapDL();

// Hiển thị ma trận vừa nhập
mt.hienThi();

// Nhập giá trị cho ma trận thứ hai
Bai10MaTranVuong mt2 = new Bai10MaTranVuong(n);
System.out.println("Nhap gia tri cho ma tran thu hai");
mt2.nhapDL();

Bai10MaTranVuong tong = Bai10MaTranVuong.congMT(mt, mt2);
System.out.println("Tong cua hai ma tran:");
tong.hienThi();

Bai10MaTranVuong tich = Bai10MaTranVuong.nhanMT(mt, mt2);
System.out.println("Tich cua hai ma tran:");
tich.hienThi();
}
}