import java.util.Scanner;

public class nestedAksesLab17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("Apakah mahasiswa aktif? (true/false)");
        mahasiswaAktif = opik.nextBoolean();

        System.out.println("Apkah sedang disanksi?");
        sedangDisanksi = opik.nextBoolean();

        System.out.println("Apakah sudah izin dosen? (true/false)");
        punyaIzinDosen = opik.nextBoolean();
        
        System.out.println("Apakah sudah diberikan asisten lab? (true/false)");
        asistenLab = opik.nextBoolean();
       

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            } 
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
        opik.close();
    }
}
