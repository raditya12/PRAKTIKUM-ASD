package jobsheet11;

public class Mahasiswa23 {
    String nama, nim, kelas;
    double ipk;

    Mahasiswa23(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.printf("\n%-10s %-10s %-3s %.1f", nama, nim, kelas, ipk);

    }
    
}
