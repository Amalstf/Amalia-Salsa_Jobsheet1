package smt2;


public class Smt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int ani = 4, budi = 15, bina = 6, cita = 11;
float pendapatan;
        System.out.println("Rekapitulasi Keuangan Pembeli:");
        System.out.println("Ani Rp: " + 4*4500 );
        System.out.println("Budi Rp: " + ((15*4500)-15*4500 *0.05));
        System.out.println("Bina Rp: " + 6*4500);
        System.out.println("Cita Rp: " + ((11*4500)-11*4500*0.05));
        pendapatan = (float) ((4*4500) + ((15*4500)-15*4500 *0.05) + (6*4500) + (11*4500)-11*4500*0.05);
        System.out.println("Total Pendapatan Laundry Sebesar Rp: "+ pendapatan);
        
         }
    
}