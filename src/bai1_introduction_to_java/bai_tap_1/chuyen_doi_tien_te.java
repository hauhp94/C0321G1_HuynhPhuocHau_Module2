package bai1_introduction_to_java.bai_tap_1;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Số tiền quy đổi sang VND là: "+ quydoi);
    }
}
