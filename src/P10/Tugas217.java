package P10;
// Uji wajib n = 5 + (17 mod 4) = 6
import java.util.Scanner;

public class Tugas217 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = opik.nextInt();
        
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int angka = i * j;
                System.out.printf("%4d", angka);
                 jumlah += angka;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlah);

        opik.close();
    }
}
