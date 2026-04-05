public class BatuMulia extends BatuAkik {
    private double skalaMohs;

    public BatuMulia(String nama, String asal, int harga, double skalaMohs) {
        super(nama, asal, harga);
        this.skalaMohs = skalaMohs;
    }

    public double getSkalaMohs() { return skalaMohs; }
    public void setSkalaMohs(double skalaMohs) { this.skalaMohs = skalaMohs; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis : Batu Mulia");
        System.out.println("Skala Mohs : " + skalaMohs);
    }
}