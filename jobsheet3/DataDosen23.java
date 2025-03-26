package jobsheet3;

public class DataDosen23 {
    
    public static String kode;
    public static String nama;
    public static boolean jenisKelamin;
    public static int usia;

    static void dataSemuaDosen(Dosen23[] arrayOfDosen) {
  
        System.out.println("========== DATA SEMUA DOSEN ==========");
  
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen Ke-" + (i + 1));
            System.out.println("Kode             : " + arrayOfDosen[i].kode);
            System.out.println("Nama             : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin    : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia             : " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------");
        }
        System.out.println();
    }

    static void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {

        System.out.println("====== DOSEN BERDASARKAN GENDER ======");


        System.out.println("Dosen Pria : ");
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                System.out.println(dosen.nama);
            }
        }

        System.out.println("Dosen Wanita : ");
        for (Dosen23 dosen : arrayOfDosen) {
            if (!dosen.jenisKelamin) {
                System.out.println(dosen.nama);
            }
        }
        System.out.println();
    }
    
    static void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {

        System.out.println("==== RATA RATA USIA SESUAI GENDER ====");


        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {  
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria : " + (double) totalUsiaPria / jumlahPria);
        } else {
            System.out.println("Tidak ada dosen pria.");
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (double) totalUsiaWanita / jumlahWanita);
        } else {
            System.out.println("Tidak ada dosen wanita.");
        }

        System.out.println();
    }

    static void infoDosenPalingTua(Dosen23[] arrayOfDosen) {

        System.out.println("========= DOSEN PALING TUA ===========");


        int dsnTertua = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[dsnTertua].usia) {
                dsnTertua = i;
            }
        }

        System.out.println("Dosen Paling Tua : " + arrayOfDosen[dsnTertua].nama);
        System.out.println("Usia : " + arrayOfDosen[dsnTertua].usia);
        System.out.println();
    }

    static void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        System.out.println("========== DOSEN PALING MUDA =========");

        int dsnTermuda = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[dsnTermuda].usia) {
                dsnTermuda = i;
            }
        }

        System.out.println("Dosen Paling Muda : " + arrayOfDosen[dsnTermuda].nama);
        System.out.println("Usia : " + arrayOfDosen[dsnTermuda].usia);
        System.out.println();
    }

    public void tambah(Dosen23 dosen23) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambah'");
    }

    public static void tampil(DataDosen23[] dataDosen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampil'");
    }

    public void SortingASC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SortingASC'");
    }

    public void insertionSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertionSort'");
    }

    public static void SortingAsc(DataDosen23[] dataDosen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SortingAsc'");
    }

    public static void sortingDSC(DataDosen23[] dataDosen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortingDSC'");
    }
}