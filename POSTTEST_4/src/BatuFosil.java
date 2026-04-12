public class BatuFosil extends BatuAkik{
    private String usiaFosil;

    public BatuFosil(String nama, String asal, int harga, String usiaFosil){
        super(nama, asal, harga);
        this.usiaFosil = usiaFosil;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis : Batu Fosil");
        System.out.println("Usia : " + usiaFosil);
    }

    @Override
    public void tampilkanInfo(boolean ringkas){
        if (ringkas){
            System.out.println("[Fosil] " + nama + " (Usia: " + usiaFosil + ") - Rp" + harga);
        } else {
            this.tampilkanInfo();
        }
    }

    public String getUsiaFosil(){return usiaFosil;}
    public void setUsiaFosil(String usiaFosil){
        this.usiaFosil = usiaFosil;
    }
}