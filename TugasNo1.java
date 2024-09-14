import java.util.Scanner; //Digunakan untuk memanggil kelas agar bisa membaca input
public class TugasNo1 { //Nama program atau kelas
    public static void main(String[] args) { //Bagian utama program dimana semua perintah akan dijalankan
        int tarifListrik = 1500; //Mendeklarasikan variabel tarifListrik
        int pengecekanListrik = 500; //Mendeklarasikan variabel pengecekanListrik
        double penggunaanListrik, totalTagihan; //Mendeklarasikan dua variabel: penggunaanListrik dan totalTagihan

        Scanner input = new Scanner(System.in); //Deklarasi Scanner untuk mengambil input dari pengguna

        System.out.print("Masukkan penggunaan listrik: "); //Menampilkan teks "Masukkan penggunaan listrik:" ke layar dan meminta pengguna untuk memasukkan penggunaan listrik
        penggunaanListrik = input.nextDouble(); //Mengambil input dari pengguna

        totalTagihan = penggunaanListrik * tarifListrik; //Menghitung total tagihan listrik

        System.out.println("Total tagihan listrik: " + totalTagihan); //Menampilkan total tagihan listrik yang telah dihitung ke layar
        System.out.println("Apa penggunaan listrik melebihi 500 kWh? "+ (penggunaanListrik > pengecekanListrik)); //Menampilkan teks dan menampilkan hasilnya (true atau false)
    }
}