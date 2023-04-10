package Baitapbosung;
import java.util.Scanner;
import java.util.Arrays;

public class Bai9Mang {
    private int n;
    private float[] A;

    public Bai9Mang(int n) {
        this.n = n;
        this.A = new float[n];
    }
    
    public void nhapSoPhanTu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();
        A = new float[n];
    }

    public void nhapDL() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i+1) + ": ");
            A[i] = scanner.nextFloat();
        }
    }

    public void sapXep() {
        Arrays.sort(A);
    }

    public boolean kiemTraDanDau() {
        if (n <= 1) {
            return true;
        }
        boolean tang = A[0] < A[1];
        for (int i = 2; i < n; i++) {
            if ((A[i-1] < A[i]) != tang) {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    Bai9Mang bai9Mang = new Bai9Mang(5);
    bai9Mang.nhapSoPhanTu();
    bai9Mang.nhapDL();
    bai9Mang.sapXep();
    boolean isDanDau = bai9Mang.kiemTraDanDau();

    System.out.println("Cac phan tu cua mang sau khi sap xep:");
    for (int i = 0; i < bai9Mang.n; i++) {
        System.out.print(bai9Mang.A[i] + " ");
    }
    System.out.println();

    if (isDanDau) {
        System.out.println("Mang tao thanh day so dan dau");
    } else {
        System.out.println("Mang khong tao thanh day so dan dau");
    }
}
}
