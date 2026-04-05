public class BatuFosil extends BatuAkik {
    private String usiaFosil;

    public BatuFosil(String nama, String asal, int harga, String usiaFosil) {
        super(nama, asal, harga);
        this.usiaFosil = usiaFosil;
    }

    public String getUsiaFosil() { return usiaFosil; }
    public void setUsiaFosil(String usiaFosil) { this.usiaFosil = usiaFosil; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis : Batu Fosil");
        System.out.println("Usia  : " + usiaFosil);
    }
}