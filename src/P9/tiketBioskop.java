package P9;
// parameter unik absen 17
import java.util.Scanner;
public class tiketBioskop {

    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        double hargaTiket = 50000;
        double totalPenjualan = 0;
        double totalHarga;
        double diskon;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = opik.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, silakan input ulang!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 9) {
                diskon = 0.16;
            } else if (jumlahTiket > 5) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.printf("Total penjualan: Rp %,.0f%n", totalPenjualan);

        opik.close();
    }
}

