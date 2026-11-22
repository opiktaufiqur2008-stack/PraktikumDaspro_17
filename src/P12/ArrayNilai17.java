package P12;
// Percobaan 2 (uji wajib tambahan) salah satu nilai yang diinput 60 + (P mod 41)77
import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner opik = new Scanner(System.in);

        int nomor = 1;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + nomor + ": ");
            nilaiAkhir[i] = opik.nextInt();
            nomor++;
        }

        nomor = 1;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + nomor + ": "
                        + nilai + " (LULUS)");
            }
            nomor++;
        }

        opik.close();
    }
}
