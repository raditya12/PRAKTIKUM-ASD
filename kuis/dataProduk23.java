
public class dataProduk23 {

        String nama23;
        double harga23;
        int stok23;
        double diskon23;
        
        public dataProduk23(String nama, double harga, int stok, double diskon) {
            this.nama23 = nama;
            this.harga23 = harga;
            this.stok23 = stok;
            this.diskon23 = diskon;
        }
        static void tampilkanInformasi(dataProduk23[] arrayDataProduk23){
            System.out.println("===== DATA SEMUA PRODUK ====");
            for (int i = 0; i < arrayDataProduk23.length; i++){
                System.out.println("DATA PRODUK KE-" +(i+1));
                System.out.println("Nama Produk : " + arrayDataProduk23[i].nama23);
                System.out.println("Harga Produk : " + arrayDataProduk23[i].harga23);
                System.out.println("Stok Produk : " + arrayDataProduk23[i].stok23);
                System.out.println("Diskon Produk : " + arrayDataProduk23[i].diskon23);
            }
            System.out.println();


            
        }
        static void hitungHargaDiskon(dataProduk23[] arrayDataProduk23){
            System.out.println("==== HARGA SETELAH DISKON ====");
            for (int i = 0; i < arrayDataProduk23.length; i++){
                double hargaDiskon;
                hargaDiskon = arrayDataProduk23[i].harga23 - (arrayDataProduk23[i].harga23 * arrayDataProduk23[i].diskon23 / 100);
                System.out.println("Harga Produk ke " +(i+1) + " setelah Diskon : " + hargaDiskon);
                System.out.println();
            }

        }
    }
