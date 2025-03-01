package jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo23 { 
    public static void main(String[] args) { 
        int jml = 0;
        MataKuliah23[] arrayOfMatakuliah = new MataKuliah23[jml]; 
         
        for (int i = 0; i < 3; i++) { 
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1)); 
            arrayOfMatakuliah[i] = new MataKuliah23("", "", 0, 0); 
            arrayOfMatakuliah[i].tambahData(); 
        } 
         
        for (int i = 0; i < 3; i++) { 
            arrayOfMatakuliah[i].tampilkanData(i); 
        } 
    } 
}