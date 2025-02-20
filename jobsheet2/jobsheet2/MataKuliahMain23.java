package jobsheet2;

import java.rmi.server.ServerRef;

import jobsheet1.mataKuliah;

public class MataKuliahMain23{
    public static void main(String[] args) {
        MataKuliah23 mk1 = new MataKuliah23();
        mk1.kodeMK = "MK001";
        mk1.nama = "ASD";
        mk1.sks = 3;
        mk1.jam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangiJam(10);
        mk1.tampilInformasi();

        MataKuliah23 mk2 = new MataKuliah23("MK002", "PraktikumASD", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
     }

}