package P3;
import java.util.Scanner;
public class BiayaCetak {

    public static void main(String[] args) {
        Scanner taufiq = new Scanner(System.in);
        
        int x;
        int biayaCetak = 500;
        int biayaJilid = 5000;
        int total;

        System.out.print("Masukkan jumlah lembaran");
        x = taufiq.nextInt();

        total = (x * biayaCetak) + biayaJilid;

        System.out.println("Total biaya yang harus dibayar: Rp" + total);

        taufiq.close();

    }
}