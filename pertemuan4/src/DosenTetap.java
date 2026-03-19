
import java.time.LocalDate;

public class DosenTetap extends Dosen{

    // ATRIBUT 
    private final String nidn;
    private static final int BUP = 65;
    private static double persenTunjangan = 0.02;

    // KONSTRUKTOR 
    /* Konstruktor untuk menginisialisasi data dosen tetap */
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // SELEKTOR 
    /* Mengambil NIDN */
    public String getNidn(){
        return nidn;
    }

    /* Mengambil BUP */
    public static int getBUP(){
        return BUP;
    }

    /* Mengambil persen tunjangan */
    public static double getPersenTunjangan(){
        return persenTunjangan;
    }

    // MUTATOR 
    /* Mengubah persen tunjangan (tidak boleh lebih kecil dari sebelumnya) */
    public static void setPersenTunjangan(double persenTunjanganBaru){
        if(persenTunjanganBaru < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        } else {
            DosenTetap.persenTunjangan = persenTunjanganBaru;
        }
    }

    // METHOD LAIN 
    /* Menghitung tunjangan dosen tetap (2% x masa kerja x gaji pokok) */
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }

    /* Menghitung tanggal pensiun (tanggal lahir + BUP, lalu tanggal 1 bulan berikutnya) */
    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    // OVERRIDE METHOD 
    /* Menampilkan informasi lengkap dosen tetap */
    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + getNidn());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggalIndonesia(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggalIndonesia(getTmt()));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " 
            + getLamaKerja().getYears() + " tahun " 
            + getLamaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " 
            + formatTanggalIndonesia(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " 
            + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan       : " 
            + (getPersenTunjangan()*100) + "% x "
            + formatRupiah(getGajiPokok()) + " = "
            + formatRupiah(getTunjangan()));
    }
}