import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai{

    // ATRIBUT 
    protected final String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // KONSTRUKTOR 
    /* Konstruktor untuk menginisialisasi data pegawai */
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // SELEKTOR 
    /* Mengambil NIP pegawai */
    public String getNip(){
        return nip;
    }

    /* Mengambil nama pegawai */
    public String getNama(){
        return nama;
    }

    /* Mengambil tanggal lahir */
    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    /* Mengambil TMT (Terhitung Mulai Tanggal) */
    public LocalDate getTmt(){
        return tmt;
    }

    /* Mengambil gaji pokok */
    public double getGajiPokok(){
        return gajiPokok;
    }

    // MUTATOR 
    /* Mengubah nama pegawai */
    public void setNama(String nama){
        this.nama = nama;
    }

    /* Mengubah tanggal lahir */
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    /* Mengubah TMT */
    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    /* Mengubah gaji pokok */
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // METHOD LAIN 
    /* Menghitung lama kerja berdasarkan TMT hingga saat ini */
    public Period getLamaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    /* Mengubah format tanggal ke format Indonesia */
    public String formatTanggalIndonesia(LocalDate tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    /* Mengubah angka menjadi format rupiah */
    public String formatRupiah(double nilai){
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(nilai);
    }

    /* Menampilkan informasi dasar pegawai */
    public void printInfo(){
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggalIndonesia(tanggalLahir));
        System.out.println("TMT             : " + formatTanggalIndonesia(tmt));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    }
}