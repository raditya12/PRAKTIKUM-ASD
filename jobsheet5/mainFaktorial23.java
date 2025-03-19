import java.util.Scanner;
public class mainFaktorial23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        faktorial23 fk = new faktorial23();
        System.out.println("Nilai faktorial " + nilai + " Menggunakan BF : " +fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + "Menggunakan DC : " + fk.faktorialDC(nilai));

        
    }


    
}
