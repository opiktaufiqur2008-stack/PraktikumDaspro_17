import java.util.Scanner;

public class MenghitungLuasPersegiPanjang17 {
    public static void main(String[] args) {
        Scanner taufiq = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;
       
        System.out.println("Masukkan panjang");
        panjang = taufiq.nextInt();
        System.out.println("Masukkan lebar : ");
        lebar = taufiq.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi adalah " +luas);

        taufiq.close();
    }
}
