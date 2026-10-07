package P7;

import java.util.Scanner;

public class StudiKasus117 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = opik.nextInt();

        System.out.print("Masukkan Uang Bayar: ");
        uangBayar = opik.nextInt();

        totalHarga = jumlahCup*hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga*10/100;
            totalBayar = totalHarga-diskon;
        } else {
            diskon = 0;
            totalBayar = totalHarga-diskon;
        }

        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar-totalBayar;
            System.out.println("Kembalian anda adalah "+ kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.println("Uang tidak cukup,kurang Rp"+ kurang);
        }
        opik.close();
    }
}
