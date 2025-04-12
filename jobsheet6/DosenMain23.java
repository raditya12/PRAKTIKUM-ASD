import java.util.Scanner;


public class DosenMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        DataDosen23 dosen = new DataDosen23();

        String kode, nama;
        Boolean jk;
        int usia;
        int i = 0;

        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Data Dosen Setelah Di Sorting (ASC)");
            System.out.println("4. Data Dosen Setelah Di Sorting (DESC)");
            System.out.println("5. Searching menggunakan Sequantial Search");
            System.out.println("6. Searching menggunakan Binary Search");
            System.out.println("7. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Dosen ke- " +(i+1));
                    System.out.print("Kode: ");
                    kode = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Jenis Kelamin : ");
                        String dummy = sc.nextLine();
                        jk = Boolean.parseBoolean(dummy);
    
                        if (dummy.equalsIgnoreCase("Pria")) {
                            jk = true;
                            break;
                        } else if (dummy.equalsIgnoreCase("Wanita")) {
                            jk = false;
                            break;
                        }else 
                        System.out.println("Pilihan tidak valid, silahkan memilih Pria/Wanita");
                    }
                    
                    System.out.print("Usia: ");
                    usia = sc.nextInt();
                    sc.nextLine(); 
                    dosen.tambah(new Dosen23(kode, nama, jk, usia));
                    i++;
                    break;
                case 2:
                    dosen.tampil();
                    break;
                case 3:
                    dosen.sortingAsc();
                    System.out.println("Data setelah sorting ASC:");
                    dosen.tampil();
                    break;
                case 4:
                    dosen.sortingDesc();
                    System.out.println("Data setelah sorting DSC:");
                    dosen.tampil();
                    break;
                case 5:
                    System.out.println("Sequential Search");
                    System.out.print("Masukkan nama dosen yang dicari : ");
                    String cari = sc.nextLine();
                    dosen.sortingAsc();
                    dosen.pencarianDataSequential(cari);
                    break;
                case 6:
                    System.out.println("Binary Search");
                    System.out.print("Masukkan usia dosen yang ingin dicari : ");
                    int search = sc.nextInt();
                    sc.nextLine();
                    dosen.sortingAsc();
                    dosen.pencarianDataBinary(search);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    } 
    
}
