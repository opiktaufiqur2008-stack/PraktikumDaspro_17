package P12;
// Percobaan 2 (uji wajib tambahan) salah satu nilai yang diinput 60 + (P mod 41)77
import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner opik = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = opik.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
        status + ")");
        }


        opik.close();
    }
}
