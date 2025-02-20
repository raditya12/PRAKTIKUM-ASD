package jobsheet2;
public class DosenMain23 {

    public static void main(String[] args) {
        
        Dosen23 dos1 = new Dosen23();
        dos1.idDosen = "Dos1";
        dos1.nama = "John";
        dos1.statusAktif = true;
        dos1.tahunBergabung = 2020;
        dos1.bidangKeahlian = "ASD";
        
        dos1.tampilkanInfo();
        dos1.setStatusAktif(false); 
        dos1.hitungMasaKerja(2025);
        dos1.ubahKeahlian("Matdas");
        dos1.tampilkanInfo();

        Dosen23 dos2 = new Dosen23("Dos2", "Vin", false, 2021, "PKN");
        dos2.tampilkanInfo();
        dos2.setStatusAktif(true);
        dos2.hitungMasaKerja(2024);
    }
    
}