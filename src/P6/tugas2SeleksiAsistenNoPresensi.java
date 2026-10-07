import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Status aktif (true/false): ");
        boolean aktif = sc.nextBoolean();

        System.out.print("Ada sanksi akademik (true/false): ");
        boolean sanksi = sc.nextBoolean();

        System.out.print("Nilai Dasar Pemrograman: ");
        double nilai = sc.nextDouble();

        System.out.print("Punya sertifikat (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        System.out.print("Nilai wawancara: ");
        double wawancara = sc.nextDouble();

        int minPemrograman = 81; 
        int minWawancara = 76;   

        if (aktif && !sanksi) {
            if (nilai >= minPemrograman || sertifikat) {
                if (wawancara >= minWawancara) {
                    System.out.println("DITERIMA sebagai asisten.");
                } else {
                    System.out.println("GAGAL: nilai wawancara kurang dari 76.");
                }
            } else {
                System.out.println("GAGAL: nilai pemrograman kurang dari 81 dan tidak memiliki sertifikat.");
            }
        } else {
            System.out.println("GAGAL: mahasiswa tidak aktif atau sedang terkena sanksi akademik.");
        }
        sc.close();
    }
}