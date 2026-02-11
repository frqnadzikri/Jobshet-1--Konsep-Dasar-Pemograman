import java.util.Scanner;

public class HitungIPSemester {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Program Menghitung IP Semester");
            System.out.println("================================\n");
            
            // Input jumlah mata kuliah
            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMK = input.nextInt();
            input.nextLine(); // Konsumsi newline
            
            // Array untuk menyimpan data
            String[] namaMK = new String[jumlahMK];
            int[] bobotSKS = new int[jumlahMK];
            double[] nilaiAngka = new double[jumlahMK];
            String[] nilaiHuruf = new String[jumlahMK];
            double[] nilaiSetara = new double[jumlahMK];
            
            // Input data setiap mata kuliah
            for (int i = 0; i < jumlahMK; i++) {
                System.out.println("\nMata Kuliah ke-" + (i + 1));
                System.out.print("Nama Mata Kuliah: ");
                namaMK[i] = input.nextLine();
                
                System.out.print("Bobot SKS: ");
                bobotSKS[i] = input.nextInt();
                
                System.out.print("Nilai Angka (0-100): ");
                nilaiAngka[i] = input.nextDouble();
                input.nextLine(); // Konsumsi newline
                
                // Konversi nilai angka ke nilai huruf dan setara
                if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                    nilaiHuruf[i] = "A";
                    nilaiSetara[i] = 4.0;
                } else if (nilaiAngka[i] > 73 && nilaiAngka[i] < 80) {
                    nilaiHuruf[i] = "B+";
                    nilaiSetara[i] = 3.5;
                } else if (nilaiAngka[i] >= 65 && nilaiAngka[i] <= 73) {
                    nilaiHuruf[i] = "B";
                    nilaiSetara[i] = 3.0;
                } else if (nilaiAngka[i] > 60 && nilaiAngka[i] < 65) {
                    nilaiHuruf[i] = "C+";
                    nilaiSetara[i] = 2.5;
                } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                    nilaiHuruf[i] = "C";
                    nilaiSetara[i] = 2.0;
                } else if (nilaiAngka[i] >= 39 && nilaiAngka[i] <= 50) {
                    nilaiHuruf[i] = "D";
                    nilaiSetara[i] = 1.0;
                } else {
                    nilaiHuruf[i] = "E";
                    nilaiSetara[i] = 0.0;
                }
            }
            
            // Hitung IP Semester
            double totalNilaiSetaraXSKS = 0;
            int totalSKS = 0;
            
            for (int i = 0; i < jumlahMK; i++) {
                totalNilaiSetaraXSKS += nilaiSetara[i] * bobotSKS[i];
                totalSKS += bobotSKS[i];
            }
            
            double ipSemester = totalNilaiSetaraXSKS / totalSKS;
            
            // Tampilkan hasil konversi nilai
            System.out.println("\n\nhasil Konversi Nilai");
            System.out.println("=====================");
            System.out.printf("%-40s %12s %12s %12s\n", 
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
            System.out.println("------------------------------------------------------------------------");
            
            for (int i = 0; i < jumlahMK; i++) {
                System.out.printf("%-40s %12.2f %12s %12.2f\n", 
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
            }
            
            // Tampilkan IP Semester
            System.out.println("\nIP : " + String.format("%.2f", ipSemester));
            
        }
    }
}
