package Baitapbosung;
import java.util.Scanner;

public class Bai7 {
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

    public boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void hienThiSoNguyenTo() {
        System.out.println("Danh sach cac so nguyen to <= n:");
        for (int i = 2; i <= n; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void hienThiNSoNguyenTo() {
        System.out.println("Danh sach " + n + " so nguyen to dau tien:");
        int count = 0;
        int i = 2;
        while (count < n) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }

    public void hienThiNFibonacci() {
        System.out.println("Danh sach " + n + " so Fibonacci dau tien:");
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bai7 daySo = new Bai7();
        daySo.nhapDuLieu();
        daySo.hienThiSoNguyenTo();
        daySo.hienThiNSoNguyenTo();
        daySo.hienThiNFibonacci();
    }
}