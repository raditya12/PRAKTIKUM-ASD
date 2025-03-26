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
    
}
