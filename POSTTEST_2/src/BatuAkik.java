public class BatuAkik {
    private String nama;
    private String asal;
    private int harga;

    String jenis = "Natural";

    protected void tampilkanKategori(){
        if (harga > 1000000){
            System.out.println("Kategori : Premium");
        } else {
            System.out.println("Kategori : Standar");
        }
    }

    public BatuAkik(){}

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        if (nama == null || nama.isEmpty()){
            System.out.println("Nama tidak boloh kosong.");
            this.nama = "Unknown";
        } else {
            this.nama = nama;
        }
    }

    public String getAsal(){
        return asal;
    }
    public void setAsal(String asal){
        if (asal == null || asal.isEmpty()){
            System.out.println("Asal tidak boleh kosong");
            this.asal = "Unknown";
        } else {
            this.asal = asal;
        }
    }

    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        if (harga < 0){
            System.out.println("Harga tidak boleh negatif");
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }
}
