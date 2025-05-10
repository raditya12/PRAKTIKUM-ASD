package CaseMethod;

import java.util.Scanner;

public class jtiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Mahasiswa listMhs[] = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santosa", "Informatika"),
        new Mahasiswa("22003", "Cici Sari", "Sistem Informasi Bisnis"),
        };
        

        MataKuliah listMK [] = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3),
        };

        Penilaian listPenilaian [] = {
        new Penilaian(listMhs[0], listMK[0], 80, 85, 90),
        new Penilaian(listMhs[0], listMK[1], 60, 75, 70),
        new Penilaian(listMhs[1], listMK[0], 75, 70, 80),
        new Penilaian(listMhs[2], listMK[1], 85, 90, 95),
        new Penilaian(listMhs[2], listMK[2], 80, 90, 65),
        };

        int menu;
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                for (Mahasiswa mhs : listMhs) {
                    mhs.tampilMhs();
                }
                    break;
                case 2:
                for (MataKuliah mk : listMK) {
                    mk.tampilMK();
                }
                break;
                case 3:
                for (Penilaian nilai : listPenilaian) {
                    nilai.tampilPenilaian();
                }
                    break;
                case 4:
                    bubbleSort.urutkanNilaiAkhir(listPenilaian);
                    break;
                case 5:
                System.out.print("Masukkan NIM Mahasiswa: ");
                String cari = sc.next();
            
                int posisi = sequentialSearch.cariNIM(listMhs,cari);
            
                if (posisi != -1) {
                System.out.println("Data Mahasiswa ditemukan di indeks ke-" + posisi + ":");
                listMhs[posisi].tampilMhs();
            } else {
                System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
            }
                break;
                case 6:
                System.out.print("Masukkan NIM Mahasiswa: ");
                String searchnim = sc.next();
                System.out.print("Masukkan Kode Mata Kuliah: ");
                String kodeMK = sc.next();
            
                boolean ditemukan = false;
            
                for (Penilaian nilai : listPenilaian) {
                    if (nilai.mahasiswa.NIM.equals(searchnim) &&
                        nilai.mataKuliah.KodeMK.equals(kodeMK)) {
            
                        System.out.print("Masukkan nilai Tugas baru: ");
                        double tugasBaru = sc.nextDouble();
                        System.out.print("Masukkan nilai UTS baru: ");
                        double utsBaru = sc.nextDouble();
                        System.out.print("Masukkan nilai UAS baru: ");
                        double uasBaru = sc.nextDouble();
            
                        nilai.updateNilai(tugasBaru, utsBaru, uasBaru);
            
                        System.out.println("Nilai berhasil diperbarui:");
                        nilai.tampilPenilaian();
                        ditemukan = true;
                        break;
                    }
                }
            
                if (!ditemukan) {
                    System.out.println("Data penilaian tidak ditemukan untuk NIM dan Kode Mata Kuliah tersebut.");
                }
                break;
                case 0: 
                System.out.println("Terima kasih telah menggunakan sistem akademik.");
                return;

                default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                break;
            }
        }
        
    }
}
