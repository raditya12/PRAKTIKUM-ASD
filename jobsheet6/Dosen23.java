public class Dosen23 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    int i = 0;

    Dosen23(){

    }

    Dosen23(String kd, String name,Boolean jk,int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
            System.out.println("Data Dosen ke- " + (i+1));
            System.out.println("Kode: " +kode);
            System.out.println("Nama: " +nama);
            if(jenisKelamin==true){
                System.out.println("Jenis Kelamin: Pria");
            }else{
                System.out.println("Jenis Kelamin: Wanita");
            }
            System.out.println("Usia: " +usia);
            System.out.println();

        
    }
}
