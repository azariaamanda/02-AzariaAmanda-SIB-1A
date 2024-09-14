import java.util.Scanner; //Digunakan untuk memanggil kelas agar bisa membaca input
/**
 * TugasNo2
 */
public class TugasNo2 { //Nama program atau kelas

    public static void main(String[] args) { //Bagian utama program dimana semua perintah akan dijalankan
        int jumlahJamKerja, upahPerjam; //Mendeklarasikan variabel jumlahJamKerja, upahPerjam
        double bonus, pajak, gajiBulanan, totalGajiBulanan, gajiBersihBulanan; //Mendeklarasikan variabel bonus, pajak, gajiBulanan, totalGajiBulanan, gajiBersihBulanan
        
        Scanner input = new Scanner(System.in); //Deklarasi Scanner untuk mengambil input dari pengguna

        System.out.print("Masukkan jumlah jam kerja: "); //Menampilkan teks "Masukkan jumlah jam kerja: " ke layar dan meminta pengguna untuk memasukkan jumlah
        jumlahJamKerja = input.nextInt(); //Mengambil input dari pengguna
        System.out.print("Masukkan upah perjam: "); //Menampilkan teks "Masukkan jumlah jam kerja: " ke layar dan meminta pengguna untuk memasukkan upah
        upahPerjam = input.nextInt(); //Mengambil input dari pengguna

        gajiBulanan = jumlahJamKerja * upahPerjam; //Menghitung gaji bulanan dan hasilnya disimpan dalam variabel gajiBulanan

        bonus = 0.1 * gajiBulanan; //Menghitung bonus dan hasilnya disimpan dalam variabel bonus

        totalGajiBulanan = gajiBulanan + bonus; //Menghitung total gaji bulanan dan hasilnya disimpan dalam variabel totalGajiBulanan

        pajak = 0.05 * totalGajiBulanan; //Menghitung pajak dan hasilnya disimpan dalam variabel pajak

        gajiBersihBulanan = totalGajiBulanan - pajak; //Menghitung gaji bersih bulanan dan hasilnya disimpan dalam variabel gajiBersihBulanan

        //Program menampilkan hasil perhitungan gaji bulana sebelum pajak, bonus, pajak, dan gaji bersih bulanan.
        System.out.println("Total gaji bulanan sebelum pajak: Rp " + gajiBulanan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total gaji bersih bulanan karyawan adalah " + gajiBersihBulanan);
    }
}