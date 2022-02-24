package smt2;


public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************************************");
        System.out.println("\tTOKO BUNGA ROYAL GARDEN\t");
        System.out.println("*****************************************");
        int[][] jumlahBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, pendapatan;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    algonema += jumlahBunga[i][j];
                } else if (j == 1) {
                    keladi += jumlahBunga[i][j];
                } else if (j == 2) {
                    alocasia += jumlahBunga[i][j];
                } else {
                    mawar += jumlahBunga[i][j];
                }
            }
        }

        System.out.println("Jumlah Bunga Secara Keseluruhan:");
        System.out.println("Jumlah Bunga Algonema: " + algonema);
        System.out.println("Jumlah Bunga Keladi: " + keladi);
        System.out.println("Jumlah Bunga Alocasia: " + alocasia);
        System.out.println("Jumlah Bunga Mawar: " + mawar);

        pendapatan = ((10 -1)* 75000) + ((5-2)*50000) + (15*60000) + ((7-5)*10000);
        System.out.println("Total Pendapatan: Rp. "+ pendapatan);
}
}