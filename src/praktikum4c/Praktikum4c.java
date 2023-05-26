
package praktikum4c;

import salary.*;
import java.util.ArrayList;

import dataset.datasetKaryawan;

public class Praktikum4c {

    public static void main(String[] args) {
        // TODO code application logic here
        penggajian objku = new penggajian();

        objku.setStatusMenikah("Menikah");
        System.out.println("Tunjangan Status :" + objku.getTunjStatusMenikah());

        objku.setJumlahAnak(1);
        System.out.println("Tunjangan Jumlah Anak :" + objku.getTunjJumlahAnak());

        objku.setMasaKerja(4);
        System.out.println("Tunjangan Masa Kerja :" + objku.getTunjMasaKerja());

        objku.setGolongan(2);
        System.out.println("Tunjangan Golongan :" + objku.getTunjGolongan());

        System.out.println("Gaji Total : " + objku.gajiTotal("Menikah", 1, 2, 2));



        // ==========ARRAY PADA JAVA==========
        // Array satu dimensi
        String[] kota = {"Banjarmasin","Banjarbaru"};
        System.out.println(kota.length);
        System.out.println(kota[0]);
        System.out.println(kota[1]);

        // Array dinamis
        int tahun[] = new int[3];
        tahun[0] = 2021;
        tahun[1] = 2022;
        tahun[2] = 2023;
        System.out.println(tahun[0]);
        System.out.println(tahun[1]);
        System.out.println(tahun[2]);
        System.out.println(tahun.length);


        // Array list
        // contoh 1
        ArrayList<String> kabupaten = new ArrayList<String>();
        kabupaten.add("Barito kuala");
        kabupaten.add("Batola");
        kabupaten.add("Batola hulu sungai tengah");
        kabupaten.add("Batola hulu sungai selatan");

        System.out.println(kabupaten.size());
        System.out.println(kabupaten.get(2));
        kabupaten.remove(2);


        // contoh 2
        ArrayList<Integer> umur = new ArrayList<Integer>();
        umur.add(19);
        umur.add(29);
        umur.add(25);
        System.out.println(umur.get(1));
        System.out.println(umur.size());



        // implementasi
        datasetKaryawan tes = new datasetKaryawan();
        tes.insertNip("2110010274");
        tes.insertNama("Muhammad Taufik");
        tes.insertNip("2110010384");
        tes.insertNama("Andre");
        System.out.println(tes.getRecordNip());
        System.out.println(tes.getRecordNama());
        System.out.println(tes.getRecordNip().get(0));
        System.out.println(tes.getRecordNama().get(0));

        tes.insertKaryawan("21100", "Taufik", "Mahasiswa", "Mahasiswa", 3, 0);
    }


}
