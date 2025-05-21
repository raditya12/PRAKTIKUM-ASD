package jobsheet11;

import java.util.Scanner;

public class KRSmain {
    public static void main(String[] args) {
        QueueKRS antrian = new QueueKRS();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Cek antrian kosong");
            System.out.println("2. Cek antrian penuh");
            System.out.println("3. Kosongkan antrian");
            System.out.println("4. Tambah mahasiswa ke antrian");
            System.out.println("5. Panggil 2 mahasiswa untuk proses KRS");
            System.out.println("6. Tampilkan semua antrian");
            System.out.println("7. Tampilkan 2 antrian terdepan");
            System.out.println("8. Tampilkan antrian terakhir");
            System.out.println("9. Cetak jumlah antrian");
            System.out.println("10. Cetak jumlah yang sudah proses KRS");
            System.out.println("11. Cetak jumlah yang belum proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 :
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 2 :
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 3 :
                    antrian.kosongkan();
                    break;
                case 4 :
                 {
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, prodi, kelas);
                    antrian.tambahMahasiswa(mhs);
                    break;
                }
                case 5 :
                    antrian.panggilProsesKRS();
                    break;
                case 6 :
                    antrian.tampilkanSemua();
                    break;
                case 7 :
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 8 :
                    antrian.tampilkanAkhir();
                    break;
                case 9 :
                    antrian.cetakJumlah();
                    break;
                case 10 :
                    antrian.cetakJumlahProses();
                    break;
                case 11 :
                    antrian.cetakBelumProses();
                    break;
                case 0 :
                    System.out.println("Terima kasih!");
                    break;
                default :
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

    }
}
