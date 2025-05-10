package CaseMethod;

public class bubbleSort {
    static void urutkanNilaiAkhir(Penilaian[] nilai) { 
        int n = nilai.length; 
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                if (nilai[j].nilaiAkhir < nilai[j + 1].nilaiAkhir) { 
                    Penilaian temp = nilai[j];
                    nilai[j] = nilai[j + 1]; 
                    nilai[j + 1] = temp; 
            } 
        } 
    } 
        System.out.println("Data Penilaian :"); 
        for (Penilaian p : nilai) { 
            p.tampilPenilaian(); 
    }

    }
}
