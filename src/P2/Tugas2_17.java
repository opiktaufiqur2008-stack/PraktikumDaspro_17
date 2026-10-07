import java.util.Scanner;

public class Tugas2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Studi Kasus 2 No 1
        // Data tanah
        // double lebarTanah = 30;
        // double panjangTanah = 100;
        // // Data kolam ikan
        // double diameterKolam = 5;
        // // Data taman bunga
        // double sisiTaman = 2;
    
        // Studi Kasus 2 No 2
        System.out.print("Masukkan lebar tanah (meter): ");
        double lebarTanah = input.nextDouble();

        System.out.print("Masukkan panjang tanah (meter): ");
        double panjangTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam (meter): ");
        double diameterKolam = input.nextDouble();

        System.out.print("Masukkan sisi taman bunga (meter): ");
        double sisiTaman = input.nextDouble();
        double jariJariKolam = diameterKolam / 2;

        // Menghitung luas tanah
        double luasTanah = lebarTanah * panjangTanah;

        // Menghitung luas kolam berbentuk lingkaran
        double luasKolam = Math.PI * jariJariKolam * jariJariKolam;

        // Menghitung luas taman berbentuk persegi
        double luasTaman = sisiTaman * sisiTaman;

        // Menghitung luas tanah yang tidak digunakan
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        // Menampilkan hasil
        System.out.println("===== PERHITUNGAN LUAS TANAH PAK TONO =====");
        System.out.printf("Luas Tanah           : %.2f m2%n", luasTanah);
        System.out.printf("Luas Kolam Ikan      : %.2f m2%n", luasKolam);
        System.out.printf("Luas Taman Bunga     : %.2f m2%n", luasTaman);
        System.out.println("-------------------------------------------");
        System.out.printf("Luas Tidak Digunakan : %.2f m2%n", luasTidakDigunakan);
        System.out.println("===========================================");
    }
}
