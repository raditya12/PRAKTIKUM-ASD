package jobhsheet10;


import java.util.Scanner;

public class SuratDemo23 {
    public static void main(String[] args) {
        StackSurat23 stack = new StackSurat23(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

do {
    System.out.println("Menu:");
    System.out.println("1. Menerima Surat Izin");
    System.out.println("2. Proses Surat Izin");
    System.out.println("3. Lihat Surat Izin Terakhir");
    System.out.println("4. Cari Surat berdasarkan nama mahasiswa");

    System.out.print("Pilih: ");
    pilih = sc.nextInt();
    char jenisIzin;
    sc.nextLine();
    switch (pilih) {
        case 1:
            System.out.print("ID Surat: ");
            String idSurat = sc.nextLine();
            System.out.print("nama mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            do {
                System.out.print("Jenis Izin (S atau I): ");
                jenisIzin = sc.next().charAt(0);
            } while (jenisIzin != 'S' && jenisIzin != 'I');
            System.out.print("Durasi: ");
            int durasi = sc.nextInt();
            Surat23 surat = new Surat23(idSurat, nama, kelas, jenisIzin, durasi);
            stack.push(surat);
            System.out.printf("Surat %s berhasil dikumpulkan\n", surat.namaMhs);
            break;
        case 2:
        Surat23 suratVerif = stack.pop();
        if (suratVerif != null) {
            System.out.println("Verifikasi Surat milik " + suratVerif.namaMhs);
            suratVerif.isVerificated = true;
            System.out.printf("Status Surat milik %s : %b\n", suratVerif.namaMhs, suratVerif.isVerificated);
        }
        break;
        case 3:
        Surat23 suratTeratas = stack.peek();
        if (suratTeratas != null) {
            System.out.println("Surat teratas milik : " + suratTeratas.namaMhs);
        }
        break;
        case 4:
        System.out.print("Masukkan nama surat dengan nama mahasiswa yang dicari : ");
        String namaMhs = sc.nextLine();
        int index = stack.cariSurat(namaMhs);
        stack.tampilkanSurat(index);
            break;
        case 6:
            break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
} while (pilih >= 1 && pilih <= 4);

    }
    
}

