
import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{

    // ATRIBUT 
    private String nidk;
    private LocalDate tanggalAkhirKontrak;
    private static final double persenTunjangan = 0.025;

    // KONSTRUKTOR 
    /* Konstruktor untuk menginisialisasi data dosen tamu */
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // SELEKTOR 
    /*  Mengambil NIDK */
    public String getNidk(){
        return nidk;
    }

    /* Mengambil tanggal akhir kontrak */
    public LocalDate getTanggalAkhirKontrak(){
        return tanggalAkhirKontrak;
    }

    // MUTATOR 
    /* Mengubah tanggal akhir kontrak */
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak){
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // METHOD LAIN 
    /* Menghitung tunjangan dosen tamu (2.5% x gaji pokok) */
    public double getTunjangan(){
        return persenTunjangan * getGajiPokok();
    }

    /* Menghitung sisa masa kontrak dari sekarang hingga tanggal akhir kontrak */
   public Period getSisaKontrak(){
        if(LocalDate.now().isAfter(tanggalAkhirKontrak)){
            return Period.ZERO;
        }
        return Period.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    // OVERRIDE METHOD
    /* Menampilkan informasi lengkap dosen tamu */
    @Override
    public void printInfo(){
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDK            : " + getNidk());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggalIndonesia(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggalIndonesia(getTmt()));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + getFakultas());

        Period kontrak = getSisaKontrak();
        System.out.println("Masa Kontrak    : " 
            + kontrak.getYears() + " tahun "
            + kontrak.getMonths() + " bulan");

        System.out.println("Tanggal Akhir   : " 
            + formatTanggalIndonesia(getTanggalAkhirKontrak()));

        System.out.println("Gaji Pokok      : " 
            + formatRupiah(getGajiPokok()));

        System.out.println("Tunjangan       : " 
            + (persenTunjangan * 100) + "% x "
            + formatRupiah(getGajiPokok()) + " = "
            + formatRupiah(getTunjangan()));
    }
}