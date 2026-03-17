import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MManusia {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        PNS p1 = new PNS("Satriyo", LocalDate.parse("01-04-2006", dtf), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("King Ghatfan", LocalDate.parse("01-01-2000", dtf), "Jl.Bulusan selatan dalam", 55000000, "2000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.parse("09-01-1977", dtf), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("King Widodo", LocalDate.parse("01-04-2010", dtf), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("\nPajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("\nMasa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        System.out.println("\n-Detail Info-");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
    }
}