import java.util.Scanner;

public class operatorLogikaWifi17 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false)");
        mahasiswa = opik.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false)");
        dosen = opik.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false)");
        akunDiblokir = opik.nextBoolean();

        if ((mahasiswa && dosen)  && !akunDiblokir) {
            System.out.println("Akses WIFI diberikan");
        } else {
            System.out.println("Akses WIFI ditolak");
        }

        opik.close();
    }
}
