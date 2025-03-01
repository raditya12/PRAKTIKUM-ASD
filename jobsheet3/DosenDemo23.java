package jobsheet3;
import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen : ");
        int jmldosen;

        jmldosen = sc.nextInt();
        sc.nextLine();

        Dosen23 [] arrayDosen23 = new Dosen23[jmldosen];
        String kode, nama, dummy;
        Boolean jenisKelamin = false;
        int usia;

        for (int i = 0; i < jmldosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1) );
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : " );
            nama = sc.nextLine();
            while (true) {
                System.out.print("Jenis Kelamin : ");
                dummy = sc.nextLine();
                jenisKelamin = Boolean.parseBoolean(dummy);
                
                if (dummy.equalsIgnoreCase("pria")) {
                    jenisKelamin = true;
                    break;
                }else if (dummy.equalsIgnoreCase("Wanita")) {
                    jenisKelamin = false;
                    break;
                }else
                System.out.println("Pilihan tidak valid, silakan memilih Pria/Wanita");
                
            }
            System.out.print("Usia : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------");

            arrayDosen23[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }
        int i =0; 
        for (Dosen23 dosen : arrayDosen23)  {
            System.out.println("Data Dosen ke-" + (i+1) + " : " );
            System.out.println("Kode : " + arrayDosen23[i].kode);
            System.out.println("Nama : " + arrayDosen23[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayDosen23[i].jenisKelamin ? "Pria" : "Wanita") );
            System.out.println("Usia : " +arrayDosen23[i].usia);
            i++;
            
        }

        DataDosen23.dataSemuaDosen(arrayDosen23);
        DataDosen23.jumlahDosenPerJenisKelamin(arrayDosen23);
        DataDosen23.rerataUsiaDosenPerJenisKelamin(arrayDosen23);
        DataDosen23.infoDosenPalingMuda(arrayDosen23);
        DataDosen23.infoDosenPalingTua(arrayDosen23);
        
    }
}
