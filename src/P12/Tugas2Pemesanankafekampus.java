package P12;

import java.util.Scanner;
// Tugas 2 (uji wajib) jumlah item dipesan 2 + (P mod 4) = 3
// Tugas 2 (uji wajib) indeks menu yang wajib
// dipesan
// P mod 7 = 3
public class Tugas2Pemesanankafekampus {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = opik.nextLine();

        int index = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Menu ditemukan: " + menu[index]);
            System.out.println("Harga: Rp " + harga[index]);
        } else {
            System.out.println("Maaf, menu tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = opik.nextInt();
        opik.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = opik.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        total += harga[j];
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia, silakan masukkan kembali.");
                }
            }
        }

        System.out.println("\n========== STRUK PEMESANAN ==========");
        System.out.println("No.  Nama Menu          Harga");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d %-19s Rp %,d%n",
                    (i + 1), pesanan[i], hargaPesanan[i]);
        }

        System.out.println("-------------------------------------");
        System.out.printf("Total biaya: Rp %,d%n", total);
        System.out.println("=====================================");
        System.out.println("Terima kasih telah memesan!");

        opik.close();
    }
}
