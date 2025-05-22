package jobsheet11.TUGAS;

import java.util.Scanner;

public class LayananUnitKemahasiswaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListLayananUnit antrian = new LinkedListLayananUnit();
        int pilihan;

        do{
            System.out.println("\n=== MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Lihat Antrian Terdepan Dan Paling Akhir");
            System.out.println("7. Lihat Jumlah Antrian Mahasiwa");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println(antrian.isEmpty() ? "Antrian Kosong." : "Antrian Tidak kosong.");
                    break;
                    case 2:
                    System.out.println(antrian.cekAntrianPenuh()? "Antrian Penuh." : "Antrian Belum Penuh");
                    break;
                    case 3:
                    antrian.kosongkan();
                    break;
                    case 4:
                {
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.daftarkanData(mhs);
                    break;
                }
                case 5:
                    antrian.memanggilAntrian();
                    break;
                case 6:
                    antrian.tampilAntrianDepanTerakhir();
                    break;
                case 7: 
                    antrian.tampilMahasiswaYangMengantre();
                    break;
                case 0 :
                    System.out.println("Terima kasih");
                    break;  
                default:
                System.out.println("Pilihan tidak valid");
            }
        }while(pilihan != 0);
    }
    
}
