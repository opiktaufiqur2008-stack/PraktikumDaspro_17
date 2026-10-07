import java.util.Scanner;
public class GajiKaryawan17 {
    public static void main(String[] args) {
         java.util.Scanner taufiq = new Scanner(System.in);

         int gajiPokok;
         double bonus, totGaji;
         double tunjTransp=600000;
         double tunjMkn=400000;

         System.out.println("Masukkan gaji pokok");
         gajiPokok=taufiq.nextInt();

         bonus= 0.05*gajiPokok;

         totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-0.1*gajiPokok;

         System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
         System.out.printf("Gaji yang diterima adalah Rp. %.0f%n", totGaji);

         taufiq.close();
        
    }  
}
