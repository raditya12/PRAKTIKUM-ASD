public class DataDosen23 {
    Dosen23 [] arrayDosen23 = new Dosen23[10];
    int idx;

    void tambah(Dosen23 dsn){  
        if (idx < arrayDosen23.length) {
            arrayDosen23[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    
    void tampil() {
        for (int i = 0; i < idx; i++) {
            arrayDosen23[i].tampil();
        }
    }


    void sortingAsc() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (arrayDosen23[j].usia > arrayDosen23[j + 1].usia) {
                    Dosen23 temp = arrayDosen23[j];
                    arrayDosen23[j] = arrayDosen23[j + 1];
                    arrayDosen23[j + 1] = temp;
                }
            }
        }
    }
    void sortingDesc() { 
        for (int i = 1; i < idx; i++) {
            Dosen23 temp = arrayDosen23[i];
            int j = i;
            while (j > 0 && arrayDosen23[j - 1].usia < temp.usia) {
                arrayDosen23[j] = arrayDosen23[j - 1];
                j--;
            }
            arrayDosen23[j] = temp;
        }
    }
    void pencarianDataSequential(String cariNama) {
        int jumlahHasil = 0;
        for (int i = 0; i < arrayDosen23.length; i++) {
            if (arrayDosen23[i] != null && arrayDosen23[i].nama.equalsIgnoreCase(cariNama)) {
                System.out.println("Data dosen dengan nama : " + arrayDosen23[i].nama + " ditemukan pada indeks ke- " + i);
                System.out.println("Kode : " + arrayDosen23[i].kode);
                System.out.println("Nama : " + arrayDosen23[i].nama);
                    if (arrayDosen23[i].jenisKelamin == true) {
                        System.out.println("Jenis Kelamin : Pria");
                    } else {
                        System.out.println("Jenis Kelamin : Wanita");
                    }
                System.out.println("Usia : " + arrayDosen23[i].usia);
                System.out.println();
                jumlahHasil++;
            }
        }
        if (jumlahHasil == 0) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("--------------------------------------------------");
            System.out.println("PERINGATAN : Data ditemukan sebanyak " + jumlahHasil);
            System.out.println("--------------------------------------------------");
            if (jumlahHasil > 1) {
                System.out.println("PERINGATAN : Terdapat data dosen berjumlah lebih dari 1.");
            }
        }
    }
    void pencarianDataBinary(int cariUsia){

        int awal = 0, akhir = idx -1, tengah = -1;
        boolean ditemukan = false;

        while (awal <= akhir) {
            tengah = (awal + akhir) / 2;
            if (arrayDosen23[tengah].usia == cariUsia) {
                ditemukan = true;
                break;
            }
            if (arrayDosen23[tengah].usia < cariUsia) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
         if (!ditemukan) {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan");
            return;
         }       

         int kiri = tengah, kanan = tengah;
         while (kiri >= 0 && arrayDosen23[kiri].usia == cariUsia) kiri--; {
         while (kanan < idx && arrayDosen23[kanan].usia == cariUsia)kanan++; {
            System.out.println("hasil pencarian dosen dengan usia " + cariUsia+": ");

        for (int i = kiri + 1; i < kanan; i++) {
            arrayDosen23[i].tampil();
        }
        if (kanan - kiri - 1 > 1) {
            System.out.println("Peringatan! ada lebih dari 1 dosen dengan usia yang sama");
        }
         }   

        }
    }

}
