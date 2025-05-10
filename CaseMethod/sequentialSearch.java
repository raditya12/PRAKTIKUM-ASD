package CaseMethod;

public class sequentialSearch {
    public static  int cariNIM(Mahasiswa[] listMhs, String cari){
        int posisi = -1;
            for (int j = 0; j < listMhs.length; j++) {
                if (listMhs[j].NIM.equals(cari)) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
    }
}
