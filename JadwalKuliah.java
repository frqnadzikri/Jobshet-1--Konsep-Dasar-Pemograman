import java.util.Scanner;

public class JadwalKuliah {
    
    // Fungsi untuk menginput data jadwal kuliah
    public static String[][] inputJadwal(Scanner input, int n) {
        String[][] jadwal = new String[n][4];
        
        System.out.println("\n=== INPUT DATA JADWAL KULIAH ===\n");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            input.nextLine(); // Konsumsi newline
            
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();
            
            System.out.print("Ruang: ");
            jadwal[i][1] = input.nextLine();
            
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = input.nextLine();
            
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = input.nextLine();
            
            System.out.println();
        }
        
        return jadwal;
    }
    
    // Fungsi untuk menampilkan seluruh jadwal dalam bentuk tabel
    public static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===\n");
        System.out.println("========================================================================");
        System.out.printf("%-5s %-30s %-15s %-10s %-15s\n", 
            "No", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("========================================================================");
        
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-5d %-30s %-15s %-10s %-15s\n", 
                (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("========================================================================");
    }
    
    // Fungsi untuk menampilkan jadwal berdasarkan hari tertentu
    public static void tampilkanJadwalPerHari(String[][] jadwal, String hari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hari.toUpperCase() + " ===\n");
        System.out.println("========================================================================");
        System.out.printf("%-5s %-30s %-15s %-10s %-15s\n", 
            "No", "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("========================================================================");
        
        int nomor = 1;
        boolean ada = false;
        
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-30s %-15s %-10s %-15s\n", 
                    nomor, jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                nomor++;
                ada = true;
            }
        }
        
        if (!ada) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
        System.out.println("========================================================================");
    }
    
    // Fungsi untuk menampilkan jadwal berdasarkan nama mata kuliah tertentu
    public static void tampilkanJadwalPerMataKuliah(String[][] jadwal, String namaMK) {
        System.out.println("\n=== JADWAL MATA KULIAH: " + namaMK.toUpperCase() + " ===\n");
        System.out.println("========================================================================");
        System.out.printf("%-30s %-15s %-10s %-15s\n", 
            "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("========================================================================");
        
        boolean ada = false;
        
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
                System.out.printf("%-30s %-15s %-10s %-15s\n", 
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ada = true;
            }
        }
        
        if (!ada) {
            System.out.println("Mata kuliah \"" + namaMK + "\" tidak ditemukan");
        }
        System.out.println("========================================================================");
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("==========================================");
            System.out.println("   PROGRAM PENGELOLA JADWAL KULIAH");
            System.out.println("==========================================");
            
            // Input jumlah jadwal
            System.out.print("\nMasukkan jumlah jadwal kuliah: ");
            int n = input.nextInt();
            
            // Input data jadwal menggunakan fungsi
            String[][] jadwal = inputJadwal(input, n);
            
            // Menu pilihan
            boolean running = true;
            
            while (running) {
                System.out.println("\n==========================================");
                System.out.println("MENU:");
                System.out.println("1. Tampilkan seluruh jadwal kuliah");
                System.out.println("2. Tampilkan jadwal berdasarkan hari");
                System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
                System.out.println("4. Keluar");
                System.out.println("==========================================");
                System.out.print("Pilih menu (1-4): ");
                int pilihan = input.nextInt();
                
                switch (pilihan) {
                    case 1:
                        tampilkanSemuaJadwal(jadwal);
                        break;
                        
                    case 2:
                        input.nextLine();
                        System.out.print("\nMasukkan nama hari: ");
                        String hari = input.nextLine();
                        tampilkanJadwalPerHari(jadwal, hari);
                        break;
                        
                    case 3:
                        input.nextLine();
                        System.out.print("\nMasukkan nama mata kuliah: ");
                        String namaMK = input.nextLine();
                        tampilkanJadwalPerMataKuliah(jadwal, namaMK);
                        break;
                        
                    case 4:
                        System.out.println("\nTerima kasih telah menggunakan program!");
                        running = false;
                        break;
                        
                    default:
                        System.out.println("\nPilihan tidak valid!");
                }
            }
            
        }
    }
}