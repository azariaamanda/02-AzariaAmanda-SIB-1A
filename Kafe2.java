import java.util.Scanner; //Digunakan untuk memanggil kelas agar bisa membaca input
/**
 * Kafe02
 */
public class Kafe02 { // nama program atau kelas

    public static void main(String[] args) { // bagian utama program dimana semua perintah akan dijalankan
        boolean keanggotaan; //Deklarasi variabel untuk menyimpan status keanggotaan pelanggan (true/false).
        int jmlKopi,jmlTeh, jmlRoti; //Variabel untuk menyimpan jumlah pembelian kopi, teh, dan roti
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar; //deklarasikan variabel bertipe double untuk menyimpan harga kopi, teh, dan roti
        float diskon = 10 / 100f; //deklarasikan untuk menyimpan nilai diskon, yaitu 10%
        int nominalInt;
        byte totalByte;
       
        Scanner input = new Scanner(System.in); // Deklarasi Scanner untuk mengambil input dari pengguna

        System.out.print("Masukkan keanggotaan (true/false): "); //Menampilkan teks untuk memasukkan status keanggotaan
        keanggotaan = input.nextBoolean(); //Membaca input dari pengguna
        System.out.print("Masukkan jumlah pembelian kopi: "); //Menampilkan teks untuk memasukkan jumlah pembelian kopi
        jmlKopi = input.nextInt(); //Membaca input dari pengguna
        System.out.print("Masukkan jumlah pembelian teh: "); //Menampilkan teks untuk memasukkan jumlah pembelian teh
        jmlTeh = input.nextInt(); //Membaca input dari pengguna
        System.out.print("Masukkan jumlah pembelian roti: "); //Menampilkan teks untuk memasukkan jumlah pembelian roti
        jmlRoti = input.nextInt(); //Membaca input dari pengguna

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti); //Menghitung total harga sebelum diskon dengan mengalikan jumlah item  dengan harga per item
        totalByte = (byte) totalHarga;

        nominalBayar = totalHarga - (diskon * totalHarga); //Menghitung nominalBayar setelah diskon
        nominalInt = (int) nominalBayar;
       
        System.out.println("Keanggotaan pelanggan " + keanggotaan); //Menampilkan status keanggotaan pelanggan (true atau false).
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti"); //Menampilkan jumlah item yang dibeli (kopi, teh, roti)
        System.out.println("Nominal bayar Rp " + nominalBayar); //Menampilkan nominal pembayaran setelah diskon.
        System.out.println("Nominal bayar int Rp " + nominalInt); //Menampilkan nominal pembayaran setelah diskon.
        System.out.println("Total harga byte Rp " + totalByte); //Menampilkan nominal pembayaran setelah diskon.
    }
}