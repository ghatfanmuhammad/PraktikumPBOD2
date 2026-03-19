import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{

    //  ATRIBUT 
    private String bidang;
    private static final int BUP = 55;
    private static final double persenTunjangan = 0.01;

    // KONSTRUKTOR
    /* Konstruktor untuk menginisialisasi data tendik */
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                  double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // SELEKTOR  
    /* Mengambil bidang kerja */
    public String getBidang(){
        return bidang;
    }

    /* Mengambil BUP */
    public static int getBUP(){
        return BUP;
    }

    // MUTATOR 
    /* Mengubah bidang kerja */
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // METHOD LAIN 
    /* Menghitung tunjangan tendik (1% x masa kerja x gaji pokok) */
    public double getTunjangan(){
        Period masaKerja = getLamaKerja();
        return persenTunjangan * masaKerja.getYears() * getGajiPokok();
    }

    /* Menghitung tanggal pensiun (tanggal lahir + BUP, lalu tanggal 1 bulan berikutnya) */
    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // OVERRIDE METHOD 
    /* Menampilkan informasi lengkap tendik */
    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggalIndonesia(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggalIndonesia(getTmt()));
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);

        Period masaKerja = getLamaKerja();
        System.out.println("Masa Kerja      : " 
            + masaKerja.getYears() + " tahun "
            + masaKerja.getMonths() + " bulan");

        System.out.println("Tanggal Pensiun : " 
            + formatTanggalIndonesia(getTanggalPensiun()));

        System.out.println("Gaji Pokok      : " 
            + formatRupiah(getGajiPokok()));

        System.out.println("Tunjangan       : " 
            + (persenTunjangan * 100) + "% x "
            + masaKerja.getYears() + " x "
            + formatRupiah(getGajiPokok()) + " = "
            + formatRupiah(getTunjangan()));
    }
}