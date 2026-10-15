package P6;

import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

    //     boolean mahasiswaAktif (17);
    //     boolean sanksiAkademik;
    //     int nilaiTes;
    //     int nilaiWawancara;

    //     System.out.println("Apakah status mahasisw aktif: (true/false)");
    //     mahasiswaAktif = opik.nextBoolean();

    //     System.out.println("Apakah status mahasiswa sedang di sanksi: (true/false)");
    //    sanksiAkademik = opik.nextBoolean();

    //     System.out.println("Masukkan nilai tes: ");
    //     nilaiTes = opik.nextInt();

    //     System.out.println("Masukkan nilai wawancare: ");
    //     nilaiWawancara = opik.nextInt();

    //    if (mahasiswaAktif) {
    //     if (!sanksiAkademik) {
    //         if (nilaiTes >=75) {
    //             if (nilaiWawancara >=70) {
    //                 System.out.println("Anda diterima sebagai asisten lab");
    //             } else {
    //                 System.out.println("anda tidak diterima");
    //             }
    //         } else {
    //             System.out.println("anda tidak diterima");
    //         }
    //     } else {
    //         System.out.println("anda tidak diterima");
    //     }
    //    } else {
    //     System.out.println("anda tidak diterima");
    //    }
    //    opik.close();
    boolean member;
    int totalBayar,totalBelanja,diskon;

    System.out.println("Apakah anda memiliki kartu member: (true/false");
    member = opik.nextBoolean();

    System.out.println("Masukkan jumlah total belanja: Rp ");
    totalBelanja = opik.nextInt();

    if (member) {
        if (totalBelanja >= 500000) {
            diskon = 50000;
        } else {
            diskon = 25000;
        }
    } else {
        if (totalBelanja >=200000) {
            diskon = 10000;
        } else {
            diskon = 0;
        }     
    }
    totalBayar = totalBelanja - diskon;

    System.out.println("Total belanja : Rp " + totalBelanja);
    System.out.println("diskon : Rp" + diskon);
    System.out.println("total bayar : Rp " + totalBayar);
    opik.close();

    }
}
