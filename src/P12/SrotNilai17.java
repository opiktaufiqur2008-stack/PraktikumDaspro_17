package P12;

import java.util.Arrays;
// Percobaan 4 Bagian B (uji wajib tambahan) elemen dasar array (B) 20 + (P mod 60) = 37
public class SrotNilai17 {
    public static void main(String[] args) {
        
        int[] nilai = {15, -8, 30, 20, 5, 37}; // {15,-8,30,-20,5,37}
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nilai));
    }
}
    