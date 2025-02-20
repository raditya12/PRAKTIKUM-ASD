package jobsheet1;
import java.util.Scanner;
public class perulangan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        String duaDigitTerakhir = nim.substring(nim.length() - 2);
        int n = Integer.parseInt(duaDigitTerakhir);
        
        if (n < 10) {
            n = n + 10;
        }
        
        System.out.println("n : " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
