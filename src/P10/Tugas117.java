package P10;
// Uji wajib n = 6 + (17 mod 5) = 8
import java.util.Scanner;

public class Tugas117 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = opik.nextInt();
        // int total = 0;
        // int i = 1;
        // while (i <= n) {
        //     // System.out.print("[i=" + i + "] ");     // debug sementara
        //     int j = 1;
        //     while (j <= i) {
        //         System.out.print(j+"");
        //         total++;
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        // System.out.println("Total Angka: " + total);
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                total++;
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        
        opik.close();
    }
}
