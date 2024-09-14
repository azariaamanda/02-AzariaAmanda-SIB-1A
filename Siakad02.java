import java.util.Scanner; //Digunakan untuk memanggil kelas agar bisa membaca input
/**
 * Siakad02
 */
public class Siakad02 { // nama program atau kelas

    public static void main(String[] args) { // bagian utama program dimana semua perintah akan dijalankan 
        Scanner sc = new Scanner(System.in); // Deklarasi Scanner untuk mengambil input dari pengguna

        String nama, nim; // Deklarasi 2 variabel untuk menyimpan nama dan nim yang diinput pengguna
        char kelas; //Deklarasi variabel kelas yang menyimpan karakter kelas (misalnya 'A' atau 'B').
        byte absen; //Deklarasi variabel absen untuk menyimpan nomor absen mahasiswa
        Double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir; //Deklarasi empat variabel bertipe int untuk menyimpan nilai kuis, tugas, uts, uas, dan nilai akhir.

        System.out.print("Masukkan nama: "); //Menampilkan teks "Masukkan nama:" ke layar dan meminta pengguna untuk memasukkan nama
        nama = sc.nextLine(); //Mengambil input nama dari pengguna
        System.out.print("Masukkan NIM: "); //Menampilkan teks "Masukkan NIM:" ke layar dan meminta pengguna untuk memasukkan NIM
        nim = sc.nextLine(); //mengambil input NIM dari pengguna
        System.out.print("Masukkan kelas: "); //Menampilkan teks "Masukkan kelas:" ke layar dan meminta pengguna untuk memasukkan kelas
        kelas = sc.nextLine().charAt(0); //mengambil input satu baris dari pengguna
        System.out.print("Masukkan nomor absen: "); //Menampilkan teks "Masukkan nomor absen:" ke layar dan meminta pengguna untuk memasukkan nomor absen
        absen = sc.nextByte(); // mengambil input nomor absen dari pengguna

        System.out.print("Masukkan nilai kuis: "); //Menampilkan teks "Masukkan nilai kuis:" ke layar dan meminta pengguna untuk memasukkan nilai kuis
        nilaiKuis = sc.nextDouble(); //mengambil input nilai kuis dari pengguna
        System.out.print("Masukkan nilai tugas: "); //Menampilkan teks "Masukkan nilai tugas:" ke layar dan meminta pengguna untuk memasukkan nilai tugas
        nilaiTugas = sc.nextDouble(); //mengambil input nilai tugas dari pengguna
        System.out.print("Masukkan nilai UTS: "); //Menampilkan teks "Masukkan nilai UTS:" ke layar dan meminta pengguna untuk memasukkan nilai UTS
        nilaiUts = sc.nextDouble(); //Mengambil input nilai UTS dari pengguna
        System.out.print("Masukkan nilai UAS: "); //Menampilkan teks "Masukkan nilai UTS:" ke layar dan meminta pengguna untuk memasukkan nilai UAS
        nilaiUas = sc.nextDouble(); //Mengambil input nilai UAS dari pengguna


        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUts * 0.3) + (nilaiUas * 0.35); //Menghitung nilai akhir dengan rumus sederhana dan menyimpan hasilnya ke variabel nilaiAkhir

        System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim); //Menampilkan informasi nama dan NIM mahasiswa ke layar
        System.out.println("Kelas: " + kelas + " Absen: " + absen); //Menampilkan informasi kelas dan nomor absen mahasiswa ke layar
        System.out.println("Nilai Akhir: " + nilaiAkhir); //Menampilkan nilai akhir yang sudah dihitung ke layar
    }
}