import java.util.Scanner;

public class Tugas1_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Studi Kasus 1 No 1
        // double gajiPokok = 5000000;
        // double tunjanganPerAnak = 100000;
        
        // Studi Kasus 1 NO 2
        System.out.print("Masukkan gaji pokok Pak Danur: Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan anak per bulan: Rp ");
        double tunjanganPerAnak = input.nextDouble();

        System.out.print("Masukkan jumlah anak Pak Danur: ");
        int jumlahAnak = input.nextInt();

        double persenPotonganPensiun = 10; // dalam persen

        double tunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = (persenPotonganPensiun / 100) * gajiPokok;
        double gajiBersih = gajiPokok + tunjanganAnak - potonganPensiun;

        System.out.println("\n===== SLIP GAJI PAK DANUR =====");
        System.out.printf("Gaji Pokok            : Rp %,.0f%n", gajiPokok);
        System.out.printf("Jumlah Anak            : %d orang%n", jumlahAnak);
        System.out.printf("Tunjangan Anak         : Rp %,.0f%n", tunjanganAnak);
        System.out.printf("Potongan Dana Pensiun  : Rp %,.0f%n", potonganPensiun);
        System.out.println("--------------------------------");
        System.out.printf("Gaji Bersih            : Rp %,.0f%n", gajiBersih);
        System.out.println("================================");

        input.close();
    }
}