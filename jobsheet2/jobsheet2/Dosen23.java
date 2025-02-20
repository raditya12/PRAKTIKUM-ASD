package jobsheet2;
public class Dosen23{
    String idDosen, bidangKeahlian,nama;
    int tahunBergabung;
    boolean statusAktif;

    public Dosen23(){
    }
    public Dosen23(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this. bidangKeahlian = bidangKeahlian;
    }
    void tampilkanInfo(){
        System.out.println("ID Dosen :" + idDosen);
        System.out.println("Nama Dosen :" + nama);
        System.out.println("Status :" +statusAktif );
        System.out.println("Tahun Bergabung :" + tahunBergabung);
        System.out.println("Bidang Keahlian :" +bidangKeahlian);
    }
    void setStatusAktif(boolean statusAktif){
        this.statusAktif = statusAktif;
        System.out.println("Status dosen saat ini :" + (statusAktif ? " aktif" : " tidak aktif"));
    }
   int hitungMasaKerja(int tahunSekarang){
    int masaKerja = tahunSekarang - tahunBergabung;
    System.out.println("Masa kerja dosen :" + masaKerja + " tahun");
    return masaKerja;
   }
   void ubahKeahlian(String bidang){
    this.bidangKeahlian = bidang;
   }
}