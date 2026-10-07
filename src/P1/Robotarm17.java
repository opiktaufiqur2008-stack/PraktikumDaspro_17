public class Robotarm17 {

    public static void main(String[] args) {

       
        String A = "Bola Bintang";
        String B = "Bola Bulan";
        String C = "Kosong";

        System.out.println("Kondisi awal:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println();

      
        C = A;
        A = "Kosong";

        System.out.println("Langkah 1:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println();

       
        A = B;
        B = "Kosong";

        System.out.println("Langkah 2:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println();

        
        B = C;
        C = "Kosong";

        System.out.println("Langkah 3:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println();

       
        System.out.println("Kesimpulan:");
        System.out.println("(a) Kedua bola sudah bertukar tempat: BENAR");
        System.out.println("(b) Ada dua bola di nampan A: SALAH");
        System.out.println("(c) Ada dua bola di nampan B: SALAH");
        System.out.println("(d) Nampan A kosong: SALAH");
        System.out.println("(e) Nampan C kosong: BENAR");
        System.out.println("(f) Tidak ada yang berubah, tiap bola kembali ke tempat asalnya: SALAH");
    }
}
