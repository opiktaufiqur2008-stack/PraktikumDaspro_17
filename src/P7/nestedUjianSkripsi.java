import java.util.Scanner;

public class nestedUjianSkripsi {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        String pesan;
        
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = opik.nextLine().trim();

        System.out.print("Masukkan jumah log bilngan Pembimbing 1: ");
        int bimbinganP1 = opik.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = opik.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 5) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftarkan ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari kali P2 kurang dari 5 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 5 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        opik.close();
    }   
}
