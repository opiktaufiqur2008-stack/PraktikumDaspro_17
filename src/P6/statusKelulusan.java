import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class statusKelulusan {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        System.out.println("Masukkan Nilai Tugas: ");
        int nilaiTugas = opik.nextInt();

        System.out.println("Masukkan Nilai UTS: ");
        int nilaUTS = opik.nextInt();

        System.out.println("Masukkan Nilai UAS ");
        int nilaiUAS = opik.nextInt();

        System.out.println("Absensi kehadiran ");
        int absensi = opik.nextInt();

        System.out.println("Status bebas kompen (true/false) ");
        boolean bebasKompen = opik.nextBoolean();

        if (absensi >=75%) {
            
        }
    }
}
