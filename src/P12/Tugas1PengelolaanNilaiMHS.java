package P12;

import java.util.Scanner;
// Tugas 1 (uji wajib) jumlah nilai mahasiswa 5 + (P mod 11) = 11
// Tugas 1 (uji wajib) salah satu nilai yang diinput P mod 100 = 17

public class Tugas1PengelolaanNilaiMHS {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = opik.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = opik.nextInt();

            total += nilaiMhs[i];
        }
        double rataRata = (double) total / jumlah;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("\n===== HASIL PENGELOLAAN NILAI MAHASISWA =====");

        System.out.println("Semua nilai mahasiswa:");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" : " + nilaiMhs[i]);

            if (nilaiMhs[i] > 70) {
                System.out.println(" (LULUS)");
            } else {
                System.out.println(" (TIDAK LULUS)");
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Total nilai       : " + total);
        System.out.printf("Nilai rata-rata   : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);

        opik.close();
    }
}
