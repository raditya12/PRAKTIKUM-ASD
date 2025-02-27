package jobsheet3;

import java.util.Scanner;


public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        MataKuliah23[] arrayOfMataKuliah23 = new MataKuliah23[3];
        String kode = "", nama ="" , dummy = "";
        int sks = 0, jumlahJam = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i+1));
            System.out.println("Kode        :");
            kode = sc.nextLine();
            System.out.println("Nama        :");
            nama = sc.nextLine();
            System.out.println("SKS         :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam  :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("=======================================");

            arrayOfMataKuliah23[i] = new MataKuliah23(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode       :" + arrayOfMataKuliah23[i].kode);            
            System.out.println("Nama       :" +arrayOfMataKuliah23[i].nama);
            System.out.println("SKS        :" +arrayOfMataKuliah23[i].sks);
            System.out.println("Jumlah Jam :" +arrayOfMataKuliah23[i].jumlahJam);
            System.out.println("---------------------------------------");
        }


    }
}
