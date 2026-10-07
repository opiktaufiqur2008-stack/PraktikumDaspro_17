import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double hargaBuku;
        double diskon = 0;
        double totalHarga;
        double jumlahDiskon;
        double totalBayar;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = opik.nextLine();

        System.out.print("Masukkan harga buku: ");
        hargaBuku = opik.nextDouble();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = opik.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 3) {
                diskon = 0.10 + 0.02;
            } else {
                diskon = 0.10;
            }
        } else {
            if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku > 4) {
                    diskon = 0.06 + 0.02;
                } else {
                    diskon = 0.06 + 0.01;
                }
            } else {
                if (jumlahBuku > 4) {
                    diskon = 0.04;
                } else {
                    diskon = 0;
                }
            }
        }
        totalHarga = hargaBuku * jumlahBuku;
        jumlahDiskon = totalHarga * diskon;
        totalBayar = totalHarga - jumlahDiskon;

        System.out.println("\n===== HASIL PEMBELIAN =====");
        System.out.println("Jenis buku        : " + jenisBuku);
        System.out.println("Harga buku        : Rp " + hargaBuku);
        System.out.println("Jumlah buku       : " + jumlahBuku);
        System.out.printf("Persentase diskon : %.0f%%%n", diskon * 100);
        System.out.printf("Jumlah diskon     : Rp %.0f%n", jumlahDiskon);
        System.out.printf("Total harga       : Rp %.0f%n", totalHarga);
        System.out.printf("Total bayar       : Rp %.0f%n", totalBayar);

        opik.close();
    }
}