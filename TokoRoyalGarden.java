import java.util.Scanner;

public class TokoRoyalGarden {
    
    // Fungsi untuk menghitung pendapatan cabang
    public static double hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        double hargaAglonema = 75000;
        double hargaKeladi = 50000;
        double hargaAlocasia = 60000;
        double hargaMawar = 10000;
        
        double totalPendapatan = (aglonema * hargaAglonema) + 
                                 (keladi * hargaKeladi) + 
                                 (alocasia * hargaAlocasia) + 
                                 (mawar * hargaMawar);
        
        return totalPendapatan;
    }
    
    // Fungsi untuk menentukan status cabang
    public static String tentukanStatus(double pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("========================================");
            System.out.println("Program Pendapatan Toko RoyalGarden");
            System.out.println("========================================\n");
            
            // Data harga per jenis bunga
            System.out.println("Rincian Harga:");
            System.out.println("- Aglonema : Rp 75.000");
            System.out.println("- Keladi   : Rp 50.000");
            System.out.println("- Alocasia : Rp 60.000");
            System.out.println("- Mawar    : Rp 10.000");
            System.out.println();
            
            // Input jumlah cabang
            System.out.print("Masukkan jumlah cabang: ");
            int jumlahCabang = input.nextInt();
            input.nextLine(); // Konsumsi newline
            
            // Array untuk menyimpan data cabang
            String[] namaCabang = new String[jumlahCabang];
            int[] stockAglonema = new int[jumlahCabang];
            int[] stockKeladi = new int[jumlahCabang];
            int[] stockAlocasia = new int[jumlahCabang];
            int[] stockMawar = new int[jumlahCabang];
            double[] pendapatan = new double[jumlahCabang];
            String[] status = new String[jumlahCabang];
            
            // Input data setiap cabang
            for (int i = 0; i < jumlahCabang; i++) {
                System.out.println("\n--- Data Cabang ke-" + (i + 1) + " ---");
                System.out.print("Nama Cabang: ");
                namaCabang[i] = input.nextLine();
                
                System.out.print("Stock Aglonema yang terjual: ");
                stockAglonema[i] = input.nextInt();
                
                System.out.print("Stock Keladi yang terjual: ");
                stockKeladi[i] = input.nextInt();
                
                System.out.print("Stock Alocasia yang terjual: ");
                stockAlocasia[i] = input.nextInt();
                
                System.out.print("Stock Mawar yang terjual: ");
                stockMawar[i] = input.nextInt();
                input.nextLine(); // Konsumsi newline
                
                // Hitung pendapatan menggunakan fungsi
                pendapatan[i] = hitungPendapatan(stockAglonema[i], stockKeladi[i], 
                                                 stockAlocasia[i], stockMawar[i]);
                
                // Tentukan status menggunakan fungsi
                status[i] = tentukanStatus(pendapatan[i]);
            }
            
            // Tampilkan hasil
            System.out.println("\n\n========================================");
            System.out.println("HASIL PENDAPATAN DAN STATUS CABANG");
            System.out.println("========================================");
            
            for (int i = 0; i < jumlahCabang; i++) {
                System.out.println("\nCabang: " + namaCabang[i]);
                System.out.println("Stock Terjual:");
                System.out.println("  - Aglonema : " + stockAglonema[i] + " bunga");
                System.out.println("  - Keladi   : " + stockKeladi[i] + " bunga");
                System.out.println("  - Alocasia : " + stockAlocasia[i] + " bunga");
                System.out.println("  - Mawar    : " + stockMawar[i] + " bunga");
                System.out.println("Total Pendapatan: Rp " + String.format("%,.0f", pendapatan[i]));
                System.out.println("Status: " + status[i]);
                System.out.println("----------------------------------------");
            }
            
        }
    }
}


