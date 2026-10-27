package P9;
// parameter unik absen 17
// tarif parkir mobil = 2500 + (17 mod 6) * 250 = 3750 perjam
// tarif parkir motor = 1500 + (17 mod 6) * 250 = 2750 perjam
import java.util.Scanner;

public class tempatParkir {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = opik.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = opik.nextInt();

                if (jenis == 1) {
                    total += durasi * 3750;
                } else {
                    total += durasi * 2750;
                }
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);

        opik.close();
    }
}


