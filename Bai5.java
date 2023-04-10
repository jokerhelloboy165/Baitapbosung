package Baitapbosung;
import java.util.Scanner;

public class Bai5 {
    int[] arr;

    public void NhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void TangDan() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("day so nguyen sap xep theo thu tu tang dan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void HienThiSoNguyenTo() {
        System.out.print("\nCac so nguyen to trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            if (KiemTraSoNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private boolean KiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Bai5 utils = new Bai5();
        utils.NhapMang();
        utils.TangDan();
        utils.HienThiSoNguyenTo();
    }
}