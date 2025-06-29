package CaseMethod2;

import java.util.Scanner;

public class AntrianPasien {
    public Scanner sc = new Scanner(System.in);
    NodePasien head;
    NodePasien tail;
    QueueTransaksi transaksi = new QueueTransaksi(10);

    int maxSize = 10;
    int size = 0;

    public AntrianPasien(QueueTransaksi transaksi) {
        this.transaksi = transaksi;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }

    public boolean isFull(){
        return (size == maxSize);
    }

    public void TambahPasien(Pasien data){
        if (isFull()) {
            System.out.println("Antrian Penuh.");
            return;
        }
        NodePasien ndInput = new NodePasien(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public void LihatAntrian(){
        if (!isEmpty()) {
            NodePasien temp = head;
            System.out.println("-- Antrian Pasien --");
            System.out.println("Antrian: \t");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
                System.out.println();
                System.out.println("==============");
            }
        }else{
            System.out.println("Antrian masih kosong!");
        }
        
    }
    
    public void LayaniPasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
    }

    Pasien pasienDilayani = head.data;


        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
        }
        System.out.println("--- Layani Pasien ---");
        System.out.println("Pasien " + pasienDilayani.getNama() + " dipanggil");


        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = sc.nextLine();

        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = sc.nextLine();

        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = sc.nextInt();
        sc.nextLine(); 


        Dokter dokter = new Dokter(idDokter, namaDokter);
        TransaksiLayanan riwayatPasien = new TransaksiLayanan(pasienDilayani, dokter, durasi);

        transaksi.enqueue(riwayatPasien);


        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
        System.out.println();
    }


    public void cekSisaAntrian (){
        int count = 0;
        NodePasien temp = head;

        while (temp !=null) {
            temp = temp.next;
            count++;
        }
        System.out.println(">> Sisa Pasien dalam antrian : " + count);
    }

    public void cariPasienByNIK(String nikCari) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
    
        NodePasien temp = head;
        boolean ditemukan = false;
    
        while (temp != null) {
            if (temp.data.nik.equals(nikCari)) {
                System.out.println("--- Data Pasien Ditemukan ---");
                System.out.println("Nama    : " + temp.data.nama);
                System.out.println("NIK     : " + temp.data.nik);
                System.out.println("Keluhan : " + temp.data.keluhan);
                ditemukan = true;
                break; // Jika hanya ingin ambil 1 hasil pertama
            }
            temp = temp.next;
        }
    
        if (!ditemukan) {
            System.out.println("Pasien dengan NIK " + nikCari + " tidak ditemukan.");
        }
    }
    
    
}
