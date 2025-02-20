package jobsheet1;
import java.util.Scanner;
public class fungsi {
    static int[][] stockBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };
    
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
    public static void hitungPendapatan() {
        System.out.println("=== Pendapatan Tiap Cabang ===");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }
    
    public static void tampilkanStok() {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("=== Stok Bunga Tiap Jenis ===");
        for (int i = 0; i < namaBunga.length; i++) {
            int totalStok = 0;
            for (int j = 0; j < stockBunga.length; j++) {
                totalStok += stockBunga[j][i];
            }
            System.out.println(namaBunga[i] + ": " + totalStok);
        }
    }
    
    public static void kurangiStok() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j];
            }
        }
    }
    
    public static void main(String[] args) {
        hitungPendapatan();
        tampilkanStok();
        System.out.println("=== Mengurangi stok karena bunga mati ===");
        kurangiStok();
        tampilkanStok();
    }
}
