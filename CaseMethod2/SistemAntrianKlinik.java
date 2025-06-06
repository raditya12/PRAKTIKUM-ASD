package CaseMethod2;

import java.util.Scanner;

public class SistemAntrianKlinik {
    static Scanner sc = new Scanner(System.in);
    public static Pasien tambahPasien(){
        System.out.print("Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("NIK: ");
        String nik = sc.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = sc.nextLine();
        Pasien p = new Pasien(nama, nik, keluhan);

        System.out.println(">> Pasien masuk ke dalam antrian.");
        System.out.println();
        return p;
    }
    
    public static void main(String[] args) {
        QueueTransaksi t = new QueueTransaksi(10);
        AntrianPasien list = new AntrianPasien(t);
        int pilihan;

        do{
            System.out.println("=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Pasien p = tambahPasien();
                    list.TambahPasien(p);
                    break;
                case 2:
                    list.LihatAntrian();
                    break;
                case 3:
                    list.LayaniPasien();
                    break;
                case 4:
                    list.cekSisaAntrian();
                    break;
                case 5:
                    t.tampilkanRiwayatTransaksi();
                    break;
                case 0:
                    System.out.println("Terimakasih Sudah Menggunakan Layanan Kami.");
                    break;
                default:
                System.out.println("Pilihan tidak valid!");
            }

        }while (pilihan != 0);
    }
}
