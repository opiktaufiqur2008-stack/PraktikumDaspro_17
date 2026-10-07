import java.util.Scanner;

public class MenghitungTotalBayar17 {
    public static void main(String[] args) {
        
        // Deklarasi Scanner di dalam fungsi main()
        Scanner taufiq = new Scanner(System.in);

        // Deklarasi variabel
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        //Input harga
        System.out.print("Masukkan harga: ");
        harga = taufiq.nextDouble();

        //Menghitung potongan
        potongan = diskon * harga;

        //Menghitung jumlah bayar
        jml_bayar = harga - potongan;

        //Menampilkan jumlah yang harus dibayar
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
        taufiq.close();
        
    }
}
