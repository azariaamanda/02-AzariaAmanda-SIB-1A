import java.util.Scanner;
/**
 * PemilihanBilangan02
 */
public class PemilihanBilangan02 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Masukkan sebuah angka: ");
        // int angka = sc.nextInt();

        // if (angka %2 == 0){
        //      System.out.println("Angka " + angka + " termasuk bilangan genap");
        //  }
        //  else {
        //      System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        int angka = 8;
        String hasil;
        hasil = (angka %2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}