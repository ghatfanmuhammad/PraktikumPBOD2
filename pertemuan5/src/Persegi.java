public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        super();
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1; // Naik 10% [cite: 60]
    }

    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9; // Turun 10% [cite: 71]
    }

    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * percent / 100.0; // Skala persen [cite: 81]
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}