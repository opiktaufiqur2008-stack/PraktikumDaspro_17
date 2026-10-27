package P9;
// parameter unik absen 17
import java.util.Scanner;
public class KafeDoWhile17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        int kopi, teh, roti,totalHarga;
        String namaPelanggan;
        int hargaKopi=12000,hargaTeh=6000,hargaRoti=20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = opik.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = opik.nextInt();
            System.out.print("Jumlah teh: ");
            teh = opik.nextInt();
            System.out.print("Jumlah roti: ");
            roti = opik.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            opik.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

        opik.close();
    }   
}
