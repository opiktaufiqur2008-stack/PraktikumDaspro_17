package uts;
// parameter saya (17)
import java.util.Scanner;

public class KolamRenang_17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);


        int tiketMasuk,hargaTiket,biayaDasar;
        String layanan;
        double diskon, totalBayar;
        
        System.out.println("Masukkan layanan anda : ");
        layanan = opik.nextLine();

        System.out.println("banyak orang masuk 10 (true/false)");
        boolean tiketPertama;


        switch (tiketMasuk) {
            case 1:
                System.out.println("harga tiket : 16000");
                diskon = 15;
                break;
            case 2:
                System.out.println("harga tiket : 26000");
                diskon = 15;
                break;
            case 3:
                System.out.println("harga tiket : 11000");
                diskon = 15;
                break;
            default:
                System.out.println("harga tidak ada");
                break;
        }
        if (tiketPertama) {
            
        } else {
            
        }

    }

}
