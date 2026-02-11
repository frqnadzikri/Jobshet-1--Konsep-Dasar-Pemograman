import java.util.Scanner;

public class KodePlatNomor {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // Array 1 dimensi: Kode Plat Mobil
            char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
            
            // Array 2 dimensi: Nama Kota berdasarkan Kode Plat
            String[][] KOTA = {
                {"BANTEN", "", "", "", "", "", "", "", "", "", "", ""},           // A
                {"JAKARTA", "", "", "", "", "", "", "", "", "", "", ""},          // B
                {"BANDUNG", "", "", "", "", "", "", "", "", "", "", ""},          // D
                {"CIREBON", "", "", "", "", "", "", "", "", "", "", ""},          // E
                {"BOGOR", "", "", "", "", "", "", "", "", "", "", ""},            // F
                {"PEKALONGAN", "", "", "", "", "", "", "", "", "", ""},           // G
                {"SEMARANG", "", "", "", "", "", "", "", "", "", "", ""},         // H
                {"SURABAYA", "", "", "", "", "", "", "", "", "", "", ""},         // L
                {"MALANG", "", "", "", "", "", "", "", "", "", "", ""},           // N
                {"TEGAL", "", "", "", "", "", "", "", "", "", "", ""}             // T
            };
            
            System.out.println("======================================");
            System.out.println("Program Pencarian Kota dari Kode Plat");
            System.out.println("======================================\n");
            
            // Tampilkan daftar kode plat yang tersedia
            System.out.println("Daftar Kode Plat yang tersedia:");
            for (int i = 0; i < KODE.length; i++) {
                System.out.println(KODE[i] + " = " + KOTA[i][0]);
            }
            
            System.out.println("\n======================================\n");
            
            // Input kode plat dari pengguna
            System.out.print("Masukkan kode plat nomor (A/B/D/E/F/G/H/L/N/T): ");
            char kodePlat = input.next().toUpperCase().charAt(0);
            
            // Cari kota berdasarkan kode plat
            boolean ditemukan = false;
            String namaKota = "";
            
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i] == kodePlat) {
                    namaKota = KOTA[i][0];
                    ditemukan = true;
                    break;
                }
            }
            
            // Tampilkan hasil
            System.out.println("\n======================================");
            if (ditemukan) {
                System.out.println("Kode Plat: " + kodePlat);
                System.out.println("Nama Kota: " + namaKota);
            } else {
                System.out.println("Kode plat tidak ditemukan!");
            }
            System.out.println("======================================");
            
        }
    }
}