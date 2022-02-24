package smt2;

import java.util.Scanner;


public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int layanan;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("****************************************");
            System.out.println("\tTOKO BUNGA ROYAL GARDEN\t");
            System.out.println("*****************************************");
            System.out.println("Layanan Kami :");
            System.out.println("1. Menampilkan Stock Bunga");
            System.out.println("2. Menampilkan Seluruh stock bunga di seluruh cabang");
            System.out.println("3. Tidak Ada Layanan Yang Kami Butuhkan");
            System.out.print("Maukkan Angka Layanan Yang Anda Pilih : ");
            layanan = sc.nextInt();
            switch(layanan){
                case 1 : {
                    System.out.println("1. Menampilkan Stock Bunga");
                    stockBunga();
                }break;
                case 2 : {
                    System.out.println("2. Menampilkan seluruh stock bunga di seluruh cabang");
                    stockKeseluruhan();
                }break;
                case 3 : {
                    System.out.println("Terima Kasih Telah Mengunjungi Toko Royal Garden");
                }break;
                default : {
                    System.out.println("Silahkan Input Nomor Sesuai Layanan !");
                }
            }
        }while(layanan > 0 && layanan < 3);

        }

    
    private static void stockKeseluruhan() {
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, pendapatan;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    algonema += bunga[i][j];
                } else if (j == 1) {
                    keladi += bunga[i][j];
                } else if (j == 2) {
                    alocasia += bunga[i][j];
                } else {
                    mawar += bunga[i][j];
                }
            }
        }

        System.out.println("Jumlah Bunga di Seluruh Cabang:");
        System.out.println("Jumlah Bunga Algonema di Seluruh Cabang: " + algonema);
        System.out.println("Jumlah Bunga Keladi di Seluruh Cabang: " + keladi);
        System.out.println("Jumlah Bunga Alocasia di Seluruh Cabang: " + alocasia);
        System.out.println("Jumlah Bunga Mawar di Seluruh Cabang: " + mawar);
        System.out.println("");
    }

    private static void stockBunga() {
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        System.out.println("\t\tAlgonema\t\tKeladi\t\t\tAlocasia\t\tMawar");
        System.out.println("  \t\t  " + bunga[0][0] + "   \t\t\t  " + bunga[0][1] + "\t\t\t  " + bunga[0][2] + "  \t\t\t  " + bunga[0][3] );
        System.out.println("  \t\t  " + bunga[1][0] + "   \t\t\t  " + bunga[1][1] + "\t\t\t  " + bunga[1][2] + " \t\t\t  " +bunga[1][3]);
        System.out.println("  \t\t  " + bunga[2][0] + "   \t\t\t  " + bunga[2][1] + "\t\t\t  " + bunga[2][2] + "  \t\t\t  " + bunga[2][3]);
        System.out.println("  \t\t  " + bunga[3][0] + "   \t\t\t  " + bunga[3][1] + "\t\t\t  " + bunga[3][2] + "  \t\t\t  " + bunga[3][3]);
        System.out.println("");
}
}