import java.util.Scanner;

public class CicilanLaptop {
    public static void main(String[] args) {
        java.util.Scanner taufiq = new Scanner(System.in);

        double x, y, cicilan;
        int z;

        System.out.println("Harga laptop: ");
        x = taufiq.nextDouble();

        System.out.println("Uang muka: ");
        y = taufiq.nextDouble();

        System.out.println("Lama cicilan: ");
        z = taufiq.nextInt();

        cicilan = (x - y + (0.02 * (x - y) * z)) / z;

        System.out.println("Cicilan per bulan = Rp. " +cicilan);

        taufiq.close();
    }
    
}
