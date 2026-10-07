import java.util.Scanner;

public class seleksiBeasiswaKampus {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        String pesan;

        System.out.println("Apakah mahasiswa berstatus aktif? (true/false) ");
        String Statusmahasiswa = opik.nextLine();

        System.out.println("Masukkan IPK ");
        int IPK = opik.nextInt();

        System.out.println("Berapa penghasilan orang tua: Rp ");
        double penghasilanOrtu = opik.nextDouble();

        System.out.println("jumlah prestasi ");
        int jumlahPrestasi = opik.nextInt();

        if (IPK >3.75) {
            if (penghasilanOrtu <5000000) {
                if (jumlahPrestasi >2) {
                    
                } else (jumlahPrestasi <2);
            } else (penghasilanOrtu >5000000);
        } else (IPK <3.00);
    }
}
