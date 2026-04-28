import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("=== DATA MAKHLUK HIDUP ===");
        System.out.println("1. Manusia");
        System.out.println("2. Hewan");
        System.out.println("3. Tumbuhan");
        System.out.print("Masukkan Pilihan: ");
        int pilih = in.nextInt();
        in.nextLine();
        
        if(pilih == 1) {
            System.out.print("Nama: ");
            String nama = in.nextLine();
            System.out.print("Umur: ");
            int umur = in.nextInt();

            System.out.println("");
            System.out.println("=== HASIL ===");
            Manusia manusia1 = new Manusia(nama, umur);
            manusia1.tampilkanNama();
            manusia1.tampilkanUmur();
            manusia1.makan();
            manusia1.berjalan();
            manusia1.bersuara();
        }

        else if(pilih == 2) {
            System.out.print("Nama: ");
            String nama = in.nextLine();
            System.out.print("Umur: ");
            int umur = in.nextInt();

            System.out.println("");
            System.out.println("=== HASIL ===");
            Hewan hewan1 = new Hewan(nama, umur);
            hewan1.tampilkanNama();
            hewan1.tampilkanUmur();
            hewan1.makan();
            hewan1.berjalan();
            hewan1.bersuara();
        }

        else if(pilih == 3) {
            System.out.print("Nama: ");
            String nama = in.nextLine();
            System.out.print("Umur: ");
            int umur = in.nextInt();

            System.out.println("");
            System.out.println("=== HASIL ===");
            Tumbuhan tumbuhan1 = new Tumbuhan(nama, umur);
            tumbuhan1.tampilkanNama();
            tumbuhan1.tampilkanUmur();
            tumbuhan1.makan();
            tumbuhan1.berjalan();
            tumbuhan1.bersuara();
        }

        else {
            System.out.println("Pilihan Tidak Valid");
        }
    }
}
