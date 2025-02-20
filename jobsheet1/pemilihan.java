package jobsheet1;
import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
        
        
        if (!isValid(tugas) || !isValid(kuis) || !isValid(uts) || !isValid(uas)) {
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Nilai tidak valid");
            System.out.println("==========================");
            System.out.println("==========================");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            

            String nilaiHuruf = getNilaiHuruf(nilaiAkhir);
            

            String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";
            
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("SELAMAT ANDA " + status);
        }

    }


    private static boolean isValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static String getNilaiHuruf(double nilai) {
        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }
}
