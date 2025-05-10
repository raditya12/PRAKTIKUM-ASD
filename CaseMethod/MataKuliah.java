package CaseMethod;

public class MataKuliah {
        String KodeMK;
        String namaMK;
        int sks;
        
        public MataKuliah(String KodeMK, String namaMK, int sks){
            this.KodeMK = KodeMK;
            this.namaMK = namaMK;
            this.sks = sks;
        }
        void tampilMK(){
            System.out.println("Kode MK: "+this.KodeMK + " | " + "Nama: " + this.namaMK + " | " + "SKS: " + this.sks);
        }
        
        

    }
