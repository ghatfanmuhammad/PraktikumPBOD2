import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private int C = 0; // Ganti dengan digit ke-12 NIM Anda

    public Petani(String nama, LocalDate tgl, String alamat, double gaji, String asal_kota) {
        super(nama, tgl, alamat, gaji);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + C;
    }

    @Override
    public double hitungPajak() { 
        return 0; 
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}