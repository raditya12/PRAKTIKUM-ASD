package CaseMethod2;

public class TransaksiLayanan {
    Dokter dokter;
    Pasien pasien;
    public int durasiLayanan;
    public int biaya;

    public TransaksiLayanan (Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya(){
        return durasiLayanan * 50000;
    }

    public void tampilTransaksi(){
        System.out.println(pasien.nama + "(" +durasiLayanan +")"+ ": Rp " + biaya);
    }
    
}
