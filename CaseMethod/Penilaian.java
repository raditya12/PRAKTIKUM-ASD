package CaseMethod;

public class Penilaian {
        Mahasiswa mahasiswa;
        MataKuliah mataKuliah;
        double nilaiTugas;
        double nilaiUTS;
        double nilaiUAS;
        double nilaiAkhir;


        Penilaian(Mahasiswa mahasiswa,MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
            this.mahasiswa = mahasiswa;
            this.mataKuliah = mataKuliah;
            this.nilaiTugas = nilaiTugas;
            this.nilaiUTS = nilaiUTS;
            this.nilaiUAS = nilaiUAS;
            hitungNilaiAkhir();
            
        }
        void hitungNilaiAkhir() {
            this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        }
        void tampilPenilaian (){
            System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | " + "Nilai Akhir : " + nilaiAkhir);
        }

        public Mahasiswa getMhs() {
            return mahasiswa;
        }
        
        public MataKuliah getMk() {
            return mataKuliah;
        }
        
        public void updateNilai(double tugasBaru, double utsBaru, double uasBaru) {
            this.nilaiTugas = tugasBaru;
            this.nilaiUTS = utsBaru;
            this.nilaiUAS = uasBaru;
            hitungNilaiAkhir();
        }
        
}
