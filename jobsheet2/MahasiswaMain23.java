public class MahasiswaMain23 {
    public static void main(String[] args) {
        
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa23 mhsRaditya = new Mahasiswa23("Raditya Riefki", "244107020204", 3.86, "TI 1E");
        mhsRaditya.tampilkanInformasi();
    }
}
