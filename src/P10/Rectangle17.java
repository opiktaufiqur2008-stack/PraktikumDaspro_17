package P10;
// Uji tambahan langkah 9 (baris,kolom) uji 1 (2 + (17 mod 3) =4, 4 + (17 mod 3) =6) 
// Uji tambahan langkah 9 (baris,kolom) uji 2 (5 + (17 mod 3) =7, 2 + (17 mod 3) =4)
// Pertanyaan 2 (baris,kolom) 4 + (17 mod 4) =5, 6 + (17 mod 4) =7
import java.util.Scanner;

public class Rectangle17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = opik.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = opik.nextInt();

        for (int i = 1; i <= kolom; i++) {          // outer loop: baris
            for (int j = 1; j <= baris; j++) {      // inner loop: kolom
                System.out.print("#");               
            }
            System.out.println();                   // pindah baris
        }
        opik.close();
    }
}
