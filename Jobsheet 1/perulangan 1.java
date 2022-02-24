package smt2;

import java.util.Scanner;


public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nim, namaHari;
        long hasil;
        System.out.print("Masukkan NIM anda : ");
        hasil = sc.nextInt();
        nim = (int) (hasil % 100);
        System.out.println("============================");
        if (nim < 10) {
            System.out.println("n = " + (nim += 10));
        } else {
            System.out.println("n = " + nim);
        }
        
        namaHari = 0;
        for (int i = 0; i < nim; i++) {
            namaHari++;
            if (namaHari >= 7) {
                namaHari = 0;
            }
            if (namaHari % 7 == 0) {
                System.out.print("Minggu ");
            } else if (namaHari % 6 == 0) {
                System.out.print("Sabtu ");
            } else if (namaHari % 5 == 0) {
                System.out.print("Jumat ");
            } else if (namaHari % 4 == 0) {
                System.out.print("Kamis ");
            } else if (namaHari % 3 == 0) {
                System.out.print("Rabu ");
            } else if (namaHari % 2 == 0) {
                System.out.print("Selasa ");
            } else {
                System.out.print("Senin ");
            }
        }
}
        }