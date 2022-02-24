/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smt2;

import java.util.Scanner;



/**
 *
 * @author Hp
 */
public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        System.out.println("\tPROGRAM MENGHITUNG NILAI AKHIR\t");
        System.out.println("===============================================");
        
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiUts = sc.nextInt();
        System.out.print("Maukkan Nilai UAS : ");
        nilaiUas = sc.nextInt();
        
       System.out.println("===============================================");
       nilaiAkhir = (int) ((0.2*nilaiTugas)+(0.35*nilaiUts)+(0.45*nilaiUas));
		System.out.println("==============================");
		System.out.println("Nilai Akhir: " + nilaiAkhir);
        
                
//                if(nilaiAkhir > 80 && nilaiAkhir <= 100){
//			System.out.println("Nilai Huruf: A");
//			System.out.println("==============================");
//			System.out.println("Selamat Anda LULUS");
//		}else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ){
//			System.out.println("Nilai Huruf: B+");
//			System.out.println("==============================");
//			System.out.println("Selamat Anda LULUS");
//                } else {
//                System.out.println("Nilai huruf : E  ");
//                System.out.println("MAAF ANDA BELUM LULUS");
//            }
              if (nilaiAkhir == 100 ) {
                System.out.println("Nilai huruf : A+ ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } else if (nilaiAkhir >= 90) {
                System.out.println("nilai Huruf : A ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } else if (nilaiAkhir >= 80) {
                System.out.println("Nilai huruf : B+ ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Nilai huruf : B  ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Nilai huruf : C  ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } else if (nilaiAkhir >= 50) {
                System.out.println("Nilai huruf : D  ");
                System.out.println("SELAMAT ANDA DINYATAKAN LULUS ");
            } 
                else {
                System.out.println("Nilai huruf : E  ");
                System.out.println("MAAF ANDA BELUM LULUS");
            }    
    }
    
}
