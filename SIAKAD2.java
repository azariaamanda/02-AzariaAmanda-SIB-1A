import java.util.Scanner; 
/**
 * SIAKAD2
 */
public class SIAKAD2 { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        String nama, nim, nilaiAkhirHuruf, kualifikasi; 
        char kelas; 
        byte absen; 
        Double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir; 

        System.out.print("Masukkan nama: "); 
        nama = sc.nextLine(); 
        System.out.print("Masukkan NIM: "); 
        nim = sc.nextLine(); 
        System.out.print("Masukkan kelas: "); 
        kelas = sc.nextLine().charAt(0); 
        System.out.print("Masukkan nomor absen: "); 
        absen = sc.nextByte(); 

        System.out.print("Masukkan nilai kuis: "); 
        nilaiKuis = sc.nextDouble(); 
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble(); 
        System.out.print("Masukkan nilai ujian: "); 
        nilaiUjian = sc.nextDouble();  


        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian)/3;

        if (nilaiAkhir >80 && nilaiAkhir <=100) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")"); 
        System.out.println("Kelas " + kelas + " dengan nomor absen " + absen); 
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi); 
    }
}