import java.util.Scanner;

public class DeretanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM DERETAN BILANGAN ===");
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        // Ambil 2 digit terakhir dari NIM untuk menentukan n
        int n;
        if (nim.length() >= 2) {
            String duaDigitTerakhir = nim.substring(nim.length() - 2);
            n = Integer.parseInt(duaDigitTerakhir);
            
            // Jika n < 10, maka n = 10
            if (n < 10) {
                n = 10;
            }
        } else {
            n = 10;
        }
        
        System.out.println("n = " + n);
        System.out.print("Output: ");
        
        // Cetak deretan bilangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            // Bilangan kelipatan 3 dicetak dengan simbol #
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            // Bilangan ganjil dicetak dengan simbol *
            else if (i % 2 == 1) {
                System.out.print("* ");
            }
            // Bilangan genap (bukan kelipatan 3) dicetak sesuai angkanya
            else {
                System.out.print(i + " ");
            }
    
        }
        
        System.out.println(); // Pindah baris
        input.close();
    }
}
