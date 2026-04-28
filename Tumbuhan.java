public class Tumbuhan implements MakhlukHidup, Identitas { 
    private String nama; 
    private int umur; 

    public Tumbuhan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    @Override 
    public void makan() { 
        System.out.println("Membutuhkan air dan pupuk");
    } 

    @Override 
    public void berjalan() { 
        System.out.println("Bergerak jika terkena angin");
    } 

    @Override 
    public void bersuara() { 
        System.out.println("Tidak bersuara");
    } 

    @Override 
    public void tampilkanNama() { 
        System.out.println("Nama tumbuhan: " + this.nama);
    } 

    @Override 
    public void tampilkanUmur() { 
        System.out.println("Umur tumbuhan: " + this.umur);
    } 
  
}
