import java.util.Scanner;

public class PemilihanIf17 {
    public static void main(String[] args) {
        Scanner Taufiq = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = Taufiq.nextBoolean();

        // if (uktLunas){
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // }
        String pesan = uktLunas
        ? "Pembayaran UKtT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
        : "tidak terverifikasi";
        System.out.println(pesan);

    Taufiq.close();  
    }
}
