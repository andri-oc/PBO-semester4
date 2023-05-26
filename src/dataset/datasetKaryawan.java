
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
