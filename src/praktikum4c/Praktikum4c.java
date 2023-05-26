
package praktikum4c;
import salary.*;



public class Praktikum4c {


    public static void main(String[] args) {
        // TODO code application logic here
       penggajian objku = new penggajian(); 
       
       objku.setStatusMenikah("Menikah");
       System.out.println("Tunjangan Status :"+objku.getTunjStatusMenikah());
       
       objku.setJumlahAnak(1);
       System.out.println("Tunjangan Jumlah Anak :"+objku.getTunjJumlahAnak());
       
       objku.setMasaKerja(4);
       System.out.println("Tunjangan Masa Kerja :"+objku.getTunjMasaKerja());
       
       objku.setGolongan(2);
       System.out.println("Tunjangan Golongan :"+objku.getTunjGolongan());
       
       System.out.println("Gaji Total : " +objku.gajiTotal("Menikah", 1, 2, 2));
    }
    
 
}
