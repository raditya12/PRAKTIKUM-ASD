    package CaseMethod2;

    public class Pasien {
        public String nama;
        public String nik;
        public String keluhan ;
    ;

        public Pasien(String nama, String nik, String keluhan) {
            this.nama = nama;
            this.nik = nik;
            this.keluhan = keluhan;
        }

        public void tampil(){
            System.out.println("Nama pasien: " + nama); 
            System.out.println("NIK: " + nik );
            System.out.println("Keluhan: " + keluhan );
        }

        public String getNama() {
            return nama;
        }
        
    }
