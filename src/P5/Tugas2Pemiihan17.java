import java.util.Scanner;

public class Tugas2Pemiihan17 {
    public static void main(String[] args) {
        Scanner Taufiq = new Scanner(System.in);

        System.out.println("Masukkan jumlah SKS: ");
        int jumlahSks = Taufiq.nextInt();

        if (jumlahSks > 24){
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
        Taufiq.close();
    }
}
