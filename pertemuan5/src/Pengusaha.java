import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private int B = 0; // Ganti dengan digit ke-13 NIM Anda

    public Pengusaha(String nama, LocalDate tgl, String alamat, double gaji, String npwp) {
        super(nama, tgl, alamat, gaji);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + B;
    }

    @Override
    public double hitungPajak() { 
        return 0.15 * pendapatan; 
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}