import java.util.Scanner;
public class dataProdukMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataProduk23[] arrayDataProduk23 = new dataProduk23[4];
        String nama23;
        double harga23;
        int stok23;
        double diskon23;

        for (int i = 0; i < arrayDataProduk23.length; i++) {
            System.out.print("Masukkan Nama Produk  ke-" +(i+1) + " : ");
            nama23 = sc.nextLine();
            System.out.print("Masukkan Harga : ");
            harga23 = sc.nextDouble();
            System.out.print("Masukkan Jumlah Stok : ");
            stok23 = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Diskon : ");
            diskon23 = sc.nextDouble();
            sc.nextLine();

            arrayDataProduk23 [i] = new dataProduk23(nama23, harga23, stok23, diskon23);
        }
        
        
        
        dataProduk23.tampilkanInformasi(arrayDataProduk23);
        dataProduk23.hitungHargaDiskon(arrayDataProduk23);
    }
}
