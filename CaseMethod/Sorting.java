package CaseMethod;

public class Sorting {
    public static void urutkanNilaiAkhir(Penilaian[] listPenilaian) { 
        int n = listPenilaian.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (listPenilaian[j].nilaiAkhir < listPenilaian[j + 1].nilaiAkhir) { 
                    Penilaian temp = listPenilaian[j];
                    listPenilaian[j] = listPenilaian[j + 1]; 
                    listPenilaian[j + 1] = temp; 
            } 
        } 
    } 
        System.out.println("Data Penilaian :"); 
        for (Penilaian p : listPenilaian) { 
            p.tampilPenilaian(); 
    }
}
    
}
