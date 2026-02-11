import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input nilai komponen
        System.out.println("=== PROGRAM HITUNG NILAI AKHIR MAHASISWA ===");
        System.out.print("Masukkan Nilai Tugas (0-100): ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis (0-100): ");
        double nilaiKuis = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();
        
        // Validasi input (harus dalam rentang 0-100)
        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || 
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }
        
        // Hitung nilai akhir dengan bobot masing-masing
        double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) + 
                           (nilaiUTS * 0.30) + (nilaiUAS * 0.30);
        
        // Konversi ke nilai huruf dan setara
        String nilaiHuruf;
        double nilaiSetara;
        String kualifikasi;
        String statusKelulusan;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir > 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir > 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
            statusKelulusan = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
            statusKelulusan = "TIDAK LULUS";
        }
        
        // Output hasil
        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("Keterangan: " + statusKelulusan);
        
        input.close();
    }
}