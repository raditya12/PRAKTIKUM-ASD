package jobsheet1;

import java.util.Scanner;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi","Critical Thinking Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        System.out.println("===============================");
        System.out.println("Program Menghitung  IP Semester");
        System.out.println("===============================");
        double[] nilai = new double[mk.length];
        double[] bobotNilai = new double[mk.length];
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + " : ");
            nilai[i] = sc.nextDouble();
        }
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0;
        int totalSKS = mk.length;
        for (int i = 0; i < mk.length; i++) {
            String nilaiHuruf = "";
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai[i] = 4.0;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilaiHuruf = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilaiHuruf = "B";
                bobotNilai[i] = 3.0;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilaiHuruf = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <=60) {
                nilaiHuruf = "C";
                bobotNilai[i] = 2.0;
            } else if (nilai[i] > 39 && nilai[i] <=50){
                nilaiHuruf = "D";
                bobotNilai[i] = 1.0;
            }else {
                nilaiHuruf = "E";
                bobotNilai[i] = 0.0;
            }
            totalBobot += bobotNilai[i];

            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mk[i], nilai[i], nilaiHuruf, bobotNilai[i]);
        }
        System.out.println("===========");
        System.out.println("IP SEMESTER");
        System.out.println("===========");
        double ipSemester = totalBobot / 8;
        System.out.printf("IP Semester : %.2f\n", ipSemester);

    }
}
