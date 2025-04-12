package jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumMhs = 0;
        jumMhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }
        System.out.println("-----------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        sc.nextLine();
        System.out.println("------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
/* 
        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa Yang Ingin Dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        /* 
        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil(); */


    }
}
