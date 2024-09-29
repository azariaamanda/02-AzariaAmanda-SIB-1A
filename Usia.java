import java.util.Scanner;
/**
 * Usia
 */
public class Usia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia anda: ");
        usia = input.nextInt();

        if (usia >= 0) 
            if (usia >= 0 && usia <= 12) {
                System.out.println("kategori: Anak");
            } else if (usia >= 13 && usia <= 19) {
                System.out.println("kategori: Remaja");
            } else if (usia >= 20 && usia <= 64) {
                System.out.println("kategori: Dewasa");
            } else {
                System.out.println("kategori: Lansia");
        }
    }
}
