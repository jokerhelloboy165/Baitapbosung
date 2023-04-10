package Baitapbosung;

import java.util.Scanner;

public class Bai8XauKyTu {
    private String str;

    public Bai8XauKyTu() {
        this.str = "";
    }

    public Bai8XauKyTu(String str) {
        this.str = str;
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap xau ky tu: ");
        str = scanner.nextLine();
    }

    public int demTuBatDauBoiH() {
        int count = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.startsWith("H")) {
                count++;
            }
        }
        return count;
    }

    public int demSoTu() {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public int demKyTuA() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public void chuanHoa() {
        str = str.trim().replaceAll("\\s+", " ");
    }

    public void inXau() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Bai8XauKyTu xau = new Bai8XauKyTu();
        xau.nhapDuLieu();

        System.out.println("So tu bat dau boi chu H: " + xau.demTuBatDauBoiH());
        System.out.println("So tu trong xau: " + xau.demSoTu());
        System.out.println("So ky tu a: " + xau.demKyTuA());

        System.out.println("Xau truoc khi chuan hoa:");
        xau.inXau();
        xau.chuanHoa();

        System.out.println("Xau sau khi chuan hoa:");
        xau.inXau();
    }
}