package smt2;

import java.util.Scanner;




public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0;
        int waktu =1, jarak = 2, kecepatan = 3;
        float v, s, t;
        float hasil;
        Scanner sc = new Scanner(System.in);
        
        
            System.out.println("===========================================");
            System.out.println("PENGHITUNGAN RUMUS KECEPATAN, JARAK, DAN WAKTU");
            System.out.println("===========================================");
            System.out.println("Pilihan perhitungan :");
            System.out.println("1. Rumus Waktu");
            System.out.println("2. Rumus Jarak");
            System.out.println("3. Rumus Kecepatan");
            System.out.print("Maukkan Angka Pilihan Anda(1/2/3) : ");
            menu = sc.nextInt();
        
        
        
        if (menu == 1) {
        System.out.println("-----------------");
        System.out.println("MENGHITUNG WAKTU");
        System.out.println("-----------------");

        System.out.print("Masukkan besaran jarak dalam bentuk KM : ");
        s = (float) sc.nextDouble();
        System.out.print("Masukkan kecepatan dalam bentuk KM/jam : ");
        v = (float) sc.nextDouble();
        hasil = (float) (s/v);
        System.out.println("Hasil Akhir Menghitung Waktu : " + hasil);
        
                } else if (menu == 2) {
                 System.out.println("----------------");
                 System.out.println("MENGHITUNG JARAK");
                 System.out.println("----------------");
                 System.out.print("Masukkan kecepatan dalam bentuk KM/jam : ");
                 v = (float) sc.nextDouble();
                 System.out.print("Masukkan waktu tempuh dalam bentuk jam : ");
                 t = (float) sc.nextDouble();
                 hasil = v*t;
                 System.out.println("Hasil Akhir Menghitung Jarak : " + hasil );
       
                } else if (menu == 3) {
                     System.out.println("--------------------");
                     System.out.println("MENGHITUNG KECEPATAN");
                     System.out.println("--------------------");
        
                     System.out.print("Masukkan besaran jarak dalam bentuk KM : ");
                     s = (float) sc.nextDouble();
                     System.out.print("Masukkan waktu tempuh dalam bentuk jam : ");
                     t = (float) sc.nextDouble();
                     hasil = s/t;
                     System.out.print("Hasil Akhir Menghitung Jarak : " + hasil + "Km/Jam" );
                } else {
                    System.out.print("Nomor yang anda masukkan tidak ada dalam pilihan" );
                }
            
        
        
        
        
        
        
       

    }
}   