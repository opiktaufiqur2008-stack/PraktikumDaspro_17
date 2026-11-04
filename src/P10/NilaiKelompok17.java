package P10;
// Uji tambahan langkah 10 jumlahKelompok 2 + (17 mod 3) = 4
// Uji tambahan langkah 10 jumlahKelompok 3 + (17 mod 2) = 4
import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = opik.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = opik.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            // langkah 3 sampai 8 ditulis di dalam blok else ini
            int nomorKelompok = 1;          // perhitung outer loop
            double rataTertinggi = -1;      // -1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("kelompok " + nomorKelompok);
                double totalNilai = 0;

                // inner loop penilaian (langkah 5)
                // hitung rata rata dan cek kelompok terbaik (langkah 6-7)

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari Penilai " + j + ": ");
                        nilai = opik.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println(" Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);
                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                    // lengkapi : perbarui rataTertinggi dan kelompokTerbaik
                }
                
                nomorKelompok++;
            } 
            System.out.println("=============================");
            System.out.println("Kelompok terbaik    : " +kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        opik.close();
    }
}
