package TugasKelompok;

import java.util.Scanner;

public class StudiKasus217 {
    public static void main(String[] args) {
        Scanner opik = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, tatusPKM, dokumenKurang;

        System.out.println("Nama Mahasiswa: ");
        nama = opik.nextLine();

        System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri): ");
        jenisKegiatan = opik.nextLine();

        System.out.println("Jumlah dokumen yang diupload: ");
        jumlahDokumen = opik.nextInt();

        System.out.println("Peringkat juara (1,2,3,0): ");
        peringkatJuara = opik.nextInt();


        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri") ) {
            if (peringkatJuara >=1 && peringkatJuara <=3) {
                System.out.println("Dana penghargaan diberikan");

            }else {
                System.out.println("Tidak dapat penghargaan");
            }
        } else if (jumlahDokumen <4) {
            dokumenKurang = 4 - jumlahDokumen;
            System.out.println("Dokumen tidak lengkap (kurang "+ dokumenKurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            System.out.println("Jika dokumen melebih, silahkan coba lagi");
        } else 
            
    }
}

