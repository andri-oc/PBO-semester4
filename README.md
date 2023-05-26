# pemrogramman berbasis objek java

## Andre 2110010384

<br>

<h3>Struktur folder</h3>

`src/praktikum4c/praktikum4c.java`

> praktikum4c.java

```java

package praktikum4c;
import salary.*;
        // BELAJAR CONSTRUCTOR
public class Praktikum4c {

    public static void main(String[] args) {

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
```

`src/salary/penggajian.java`

> penggajian.java

```java

package salary;

public final class penggajian {

    //field global
    private int tunjStatusMenikah;
    private int tunjJumlahAnak;
    private int tunjMasaKerja;
    private int tunjGolongan;


    public penggajian() {} //constructor 1

    public penggajian(String status) {
        setStatusMenikah(status);
    }

    public penggajian(String status,int gol) {
        setStatusMenikah(status);
        setGolongan(gol);
    }

    public penggajian(String status,int gol,int masa) {
        setStatusMenikah(status);
        setGolongan(gol);
        setMasaKerja(masa);
    }

    public penggajian(String status,int gol,int masa,int jumlah) {
        setStatusMenikah(status);
        setGolongan(gol);
        setMasaKerja(masa);
        setJumlahAnak(jumlah);
    }

    public penggajian(int says){
        System.out.println(says);
    } //constructor 2

    //function tunjangan status menikah
    public void setStatusMenikah(String status){
        if (status.equals("Menikah")){
            this.tunjStatusMenikah=1000000;
        }else{
            this.tunjStatusMenikah=150000;
        }
    }
    public int getTunjStatusMenikah(){
        return this.tunjStatusMenikah;
    }

    //function tunjangan jumlah anak
    public void setJumlahAnak(int jumlah){
        if (jumlah==0){
            this.tunjJumlahAnak=0;
        }else if (jumlah>=1 && jumlah<=3){
            this.tunjJumlahAnak=500000;
        }else if (jumlah>=4 && jumlah<=6){
            this.tunjJumlahAnak=750000;
        }else{
            this.tunjJumlahAnak=900000;
        }
    }
    public int getTunjJumlahAnak(){
        return this.tunjJumlahAnak;
    }

    //function tunjangan masa kerja
    public void setMasaKerja(int lama){
        if (lama>=0 && lama<=3){
            this.tunjMasaKerja=400000;
        }else if (lama>=4 && lama<8){
            this.tunjMasaKerja=700000;
        }else{
            this.tunjMasaKerja=1000000;
        }
    }
    public int getTunjMasaKerja(){
        return this.tunjMasaKerja;
    }

    //function tunjangan status menikah
    public void setGolongan(int gol){
        if (gol==1){
            this.tunjGolongan=3500000;
        }else if (gol==2){
            this.tunjGolongan=4000000;
        }else{
            this.tunjGolongan=4500000;
        }
    }
    public int getTunjGolongan(){
        return this.tunjGolongan;
    }



    public int gajiTotal(){
        return getTunjGolongan()+getTunjJumlahAnak()+getTunjMasaKerja()+getTunjStatusMenikah();
    }

    public int gajiTotal(String x,int y,int z,int j){
        setStatusMenikah(x);
        setGolongan(y);
        setMasaKerja(z);
        setJumlahAnak(j);
        return getTunjGolongan()+getTunjJumlahAnak()+getTunjMasaKerja()+getTunjStatusMenikah();
    }
}


```
<h3>Array</h3>

`src/praktikum4c/praktikum4c.java`

> praktikum4c.java

```java
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
```
<br><br><br>

`src/dataset/datasetKaryawan.java`

> praktikum4c.java

```java

package dataset;
import java.util.ArrayList;

public class datasetKaryawan {

    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> status;
    private ArrayList<String> golongan;
    private ArrayList<Integer> masakerja;
    private ArrayList<Integer> jumlahanak;

    public datasetKaryawan() {
        nip = new ArrayList<String>();
        nama = new ArrayList<String>();
        status = new ArrayList<String>();
        golongan = new ArrayList<String>();
        masakerja = new ArrayList<Integer>();
        jumlahanak = new ArrayList<Integer>();
    }

    public void insertNip(String isi) {
        this.nip.add(isi);
    }

    public ArrayList<String> getRecordNip() {
        return this.nip;
    }

    public void insertNama(String isi) {
        this.nama.add(isi);
    }

    public ArrayList<String> getRecordNama() {
        return this.nama;
    }

    public void insertStatus(String isi) {
        this.status.add(isi);
    }

    public ArrayList<String> getRecordStatus() {
        return this.status;
    }

    public void insertGolongan(String isi) {
        this.golongan.add(isi);
    }

    public ArrayList<String> getRecordGolongan() {
        return this.golongan;
    }

    public void insertMasaKerja(int isi) {
        this.masakerja.add(isi);
    }

    public ArrayList<Integer> getRecordMasaKerja() {
        return this.masakerja;
    }

    public void insertJumlahAnak(int isi) {
        this.jumlahanak.add(isi);
    }

    public ArrayList<Integer> getJumlahAnak() {
        return this.jumlahanak;
    }

    public void insertKaryawan(String nip, String nama, String golongan, String status, 
            int masakerja, int jumlahanak){
        this.golongan.add(golongan);
        this.nip.add(nip);
        this.nama.add(nama);
        this.status.add(status);
        this.masakerja.add(masakerja);
        
    }
}

```