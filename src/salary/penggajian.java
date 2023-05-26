
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

