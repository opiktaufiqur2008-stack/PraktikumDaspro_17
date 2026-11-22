package P12;
// Percobaan 1 (uji wajib tambahan) bil[0], bil[1], bil[2], bil[3] P=17 ; P+8=25 ; −(1+(P mod 7))=-5 ; 20+(P mod 15)=22
import java.util.Arrays;

public class ArrayBilangan17 {
    public static void main(String[] args) {
        int[] bil = {17,25,-5,22};


        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
         
        System.out.println(Arrays.toString(bil));

    }
}
