package P10;
// Uji wajib  jumlahToko 2 + (17 mod 3) = 4
import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = opik.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalSeluruh = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        for (int t = 1; t <= jumlahToko; t++) {
            int jumlahPelanggan;
            do {
                System.out.print("\nToko " + t + " - jumlah pelanggan: ");
                jumlahPelanggan = opik.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = opik.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }
            System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = t;
            }
        }
        System.out.println("\n===== REKAP =====");
        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        opik.close();
    }
}
