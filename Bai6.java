package Baitapbosung;
import java.util.Scanner;

public class Bai6 {
    private int n;
    private double[] a;

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so nguyen duong n (2 <= n <= 100): ");
            n = scanner.nextInt();
        } while (n < 2 || n > 100);

        a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + (i+1) + ": ");
            a[i] = scanner.nextDouble();
        }
    }

    public void kiemTraDanDau() {
        boolean laDanDau = true;
        for (int i = 1; i < n; i++) {
            if (a[i] * a[i-1] < 0) {
                laDanDau = false;
                break;
            }
        }
        if (laDanDau) {
            System.out.println("Day so vua nhap la day dan dau.");
        } else {
            System.out.println("Day so vua nhap khong phai la day dan dau.");
        }
    }

    public void kiemTraCapSoCong() {
        boolean laCapSoCong = true;
        double d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i-1] != d) {
                laCapSoCong = false;
                break;
            }
        }
        if (laCapSoCong) {
            System.out.println("Day so vua nhap la cap so cong.");
        } else {
            System.out.println("Day so vua nhap khong phai la cap so cong.");
        }
    }

    public void kiemTraCapSoNhan() {
        boolean laCapSoNhan = true;
        double q = a[1] / a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] / a[i-1] != q) {
                laCapSoNhan = false;
                break;
            }
        }
        if (laCapSoNhan) {
            System.out.println("Day so vua nhap la cap so nhan.");
        } else {
            System.out.println("Day so vua nhap khong phai la cap so nhan.");
        }
    }
    
    public void kiemTraTangDan() {
        boolean laTangDan = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i-1]) {
                laTangDan = false;
                break;
            }
        }
        if (laTangDan) {
            System.out.println("Day so vua nhap la day tang dan.");
        } else {
            System.out.println("Day so vua nhap khong phai la day tang dan.");
        }
    }
    
    public void kiemTraGiamDan() {
        boolean laGiamDan = true;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i-1])
            	 laGiamDan = false;
            break;
        }
    if (laGiamDan) {
        System.out.println("Day so vua nhap la day giam dan.");
    } else {
        System.out.println("Day so vua nhap khong phai la day giam dan.");
    }
}
    public static void main(String[] args) {
        Bai6 daySo = new Bai6();
        daySo.nhapDuLieu();
        daySo.kiemTraDanDau();
        daySo.kiemTraCapSoCong();
        daySo.kiemTraCapSoNhan();
        daySo.kiemTraTangDan();
        daySo.kiemTraGiamDan();
    }
}



