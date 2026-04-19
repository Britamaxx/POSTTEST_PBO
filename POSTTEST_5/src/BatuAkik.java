public abstract class BatuAkik implements OperasiData {
    protected String nama;
    protected String asal;
    protected int harga;

    public BatuAkik(String nama, String asal, int harga){
        this.nama = nama;
        this.asal = asal;
        this.harga = harga;
    }

    public void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Asal : " + asal);
        System.out.println("Harga : Rp" + harga);
    }

    public abstract void tampilkanInfo(boolean ringkas);

    @Override
    public void validasiData() {
        System.out.println("Memvalidasi data batu: " + nama + "...");
    }

    public String getNama(){return nama;}
    public void setNama(String nama){
        if (!nama.isEmpty()) this.nama = nama;
    }

    public String getAsal(){return asal;}
    public void setAsal(String asal){
        if (!asal.isEmpty()) this.asal = asal;
    }

    public int getHarga(){return harga;}
    public void setHarga(int harga){
        if (harga >= 0) this.harga = harga;
    }
}