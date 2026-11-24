package P12;

import java.util.Scanner;

// Percobaan 4 Bagian A (uji wajib tambahan) key 50 + (P mod 50) = 67
public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = opik.nextInt();

        int[] nilai = new int[n];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai[i] = opik.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = opik.nextInt();

        boolean ditemukan = false;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        opik.close();
    }
}
