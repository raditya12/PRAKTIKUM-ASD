package jobsheet12;

import java.util.Scanner;

import org.w3c.dom.Node;

public class DLLMain {
    static Scanner sc = new Scanner(System.in);
    public static Mahasiswa23 inputMahasiswa() {
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa23 mhs = new Mahasiswa23(nim, nama, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        DoubleLinkedList23 list = new DoubleLinkedList23();
        int pilihan;

        do{
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah Data (Setelah Mahasiswa)");
            System.out.println("8. Tambah data (Index Tertentu)");
            System.out.println("9. Hapus Data Mahasiswa (Setelah Mahasiswa)");
            System.out.println("10. Hapus Data (Index Tertentu)");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data (Index Tertentu)");
            System.out.println("14. Tampilkan ukuran list");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:{
                    Mahasiswa23 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa23 mhs = inputMahasiswa();
                    list.addLast(mhs);
                    break;
                }
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node23 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan");
                        found.data.tampil();
                    }else{
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari : ");
                    String nim = sc.nextLine();
                    Node23 found = list.search(nim);
                    if (found != null) {
                        Mahasiswa23 mhs = inputMahasiswa(); 
                        list.insertAfter(nim, mhs);
                    } else {
                        System.out.println("Data not found");
                    }
                    break;
                }
                case 8: {
                    Mahasiswa23 mhs = inputMahasiswa();
                    System.out.print("Masukkan Index : ");
                    int index = sc.nextInt();

                    list.add(mhs, index);
                    break;
                }
                case 9 : {
                    System.out.print("Masukkan nama mahasiswa : ");
                    String namamhs = sc.nextLine();
                    
                    list.removeAfter(namamhs);
                    break;
                }
                case 10: {
                    System.out.print("Masukkan index : ");
                    int index = sc.nextInt();
                    list.remove(index);
                    break;
                }
                case 11: {
                    Mahasiswa23 mhs = list.getFirst();
                    if (mhs != null) {
                        mhs.tampil();
                    }
                    break;
                }
                case 12: {
                    Mahasiswa23 mhs = list.getLast();
                    if (mhs != null) {
                        mhs.tampil();
                    }
                    break;
                }
                case 13: {
                    System.out.print("Masukkan Index : ");
                    int index = sc.nextInt();

                    Mahasiswa23 mhs = list.getIndex(index);
                    if (mhs != null) {
                        mhs.tampil();
                    }
                    break;
                }
                case 14: {
                    int size = list.getSize();
                    System.out.println("Jumlah Mahasiswa : " + size);
                    break;
                }
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while (pilihan != 0);
    }
}
