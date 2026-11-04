package P10;
// Uji langkah 3 n = 2 + (17 mod 3) = 5
import java.util.Scanner;

public class Triangle17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = opik.nextInt();
        
        // Segitiga biasa
        int i = 1;
        while (i <= n) {
            // System.out.print("[i=" + i + "] ");     // debug sementara
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
        // Segitiga terbalik
        // i = n;
        // while (i >= 1) {
        //     int j = 0;
        //     while (j < i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i--;
        // }

        opik.close();
    }
}
