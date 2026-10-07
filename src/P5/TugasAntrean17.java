import java.util.Scanner;

public class TugasAntrean17 {
    public static void main(String[] args) {
        Scanner Taufiq = new Scanner(System.in);

        int kode;

        System.out.println("Masukkan kode layanan (1-4): ");
        kode = Taufiq.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah");
                System.out.println("Silahkan menuju Loket A");
                break;
            
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                System.out.println("Silakan menuju Loket B");
                break;

            case 3:
                System.out.println("Layanan: Pembayaran UKT");
                System.out.println("Silakan menuju Loket C");
                break;

            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik");
                System.out.println("Silakan menuju Loket D");
                break;

            default:
                System.out.println("Kode layann tidak tersedia");
                break; 
        }
        Taufiq.close();
    }
}
