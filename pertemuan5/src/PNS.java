import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private int A = 0; // Ganti dengan digit ke-14 NIM Anda

    public PNS(String nama, LocalDate tgl, String alamat, double gaji, String nip) {
        super(nama, tgl, alamat, gaji);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + A;
    }

    @Override
    public double hitungPajak() { 
        return 0.10 * pendapatan; 
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}