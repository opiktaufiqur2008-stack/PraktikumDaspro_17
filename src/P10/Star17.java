package P10;
// uji langkah 10 n = (3 + (17 mod 5)) = 5
// uji langkah 10 n = (9 + (17 mod 5)) = 11
// Pertanyaan 1 & 2 n = (4 + (17 mod 4)) = 5
// Pertanyaan 3 n = (10 + (17 mod 6)) = 15
import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = opik.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     System.out.print("*");
        // }
        for (int i = 2; i <= n; i +=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        opik.close();;
    }
}
