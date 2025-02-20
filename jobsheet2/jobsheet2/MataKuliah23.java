package jobsheet2;

import jobsheet1.mataKuliah;

public class MataKuliah23 {
    String kodeMK, nama;
    int sks, jam;
    
    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah : "+kodeMK);
        System.out.println("Nama Mata Kuliah : "+nama);
        System.out.println("SKS Mata Kuliah : "+sks);
        System.out.println("Jam Mata Kuliah : "+jam);
    }
    void ubahSKS(int sksbaru){
        sks = sksbaru;
    }
    void tambahJam (int tambahJam){
        jam += tambahJam;
    }
    void kurangiJam(int kurangJam){
        if (jam >= kurangJam) {
            jam -= kurangJam; 
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jam mata kuliah tidak mencukupi.");
        }
    }
    
    public MataKuliah23(){
    }
    public MataKuliah23 (String kodeMK, String nama, int sks, int jam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jam = jam;
    
    }
}