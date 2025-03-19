import java.util.Scanner;
public class mainPangkat23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = sc.nextInt();
         
        Pangkat23 [] png = new Pangkat23[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" +(i+1) + " : ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat23(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE :");
        for (Pangkat23 p : png){
            System.out.println(p.nilai + " ^ " + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER :");
        for (Pangkat23 p : png){
            System.out.println(p.nilai + " ^ " + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
        
    }
}