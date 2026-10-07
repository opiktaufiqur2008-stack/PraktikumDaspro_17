import java.util.Scanner;

public class TugasParkir17 {
    public static void main(String[] args) {
        Scanner Taufiq = new Scanner(System.in);

        int lamaParkir,tarif;

        System.out.println("Masukkan lama parkir (jam): ");
        lamaParkir = Taufiq.nextInt();

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Tarif parkir = Rp" + tarif);

        Taufiq.close();
    }
}
