import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {

        // IMPLEMENTASI KONSTRUKTOR PEGAWAI 
        Pegawai p = new Pegawai(
            "24060124140171",
            "Ghatfan Muhammad Atiwiar",
            LocalDate.of(2007, 2, 1),
            LocalDate.of(2022, 1, 1),
            7000000
        );

        // IMPLEMENTASI SELEKTOR 
        System.out.println("SELEKTOR PEGAWAI");
        System.out.println("Nama: " + p.getNama());
        System.out.println("Gaji: " + p.getGajiPokok());

        // IMPLEMENTASI MUTATOR 
        System.out.println("MUTATOR PEGAWAI");
        p.setNama("Ghatfan Muhammad Atwiar");
        p.setGajiPokok(6000000);

        // IMPLEMENTASI METHOD LAIN 
        System.out.println("METHOD LAIN PEGAWAI");
        System.out.println("Lama Kerja: " 
            + p.getLamaKerja().getYears() + " tahun "
            + p.getLamaKerja().getMonths() + " bulan");

        // PRINT INFO PEGAWAI 
        System.out.println("DATA PEGAWAI");
        p.printInfo();


        // IMPLEMENTASI DOSEN TETAP 
        System.out.println("DOSEN TETAP");

        DosenTetap dtp = new DosenTetap(
            "9545647548",
            "Humam ahmad Zadazein",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5000000,
            "Fakultas Sains dan Matematika",
            "78647324"
        );

        dtp.printInfo();


        // IMPLEMENTASI DOSEN TAMU 
        System.out.println("DOSEN TAMU");

        DosenTamu dt = new DosenTamu(
            "987654321",
            "hakimah nur yusla",
            LocalDate.of(1985, 3, 10),
            LocalDate.of(2020, 1, 1),
            4000000,
            "Fakultas Teknik",
            "12345678",
            LocalDate.of(2027, 12, 31)
        );

        dt.printInfo();


        // IMPLEMENTASI TENDIK 
        System.out.println("TENDIK");

        Tendik t = new Tendik(
            "11223344",
            "Republik Slamet",
            LocalDate.of(1992, 7, 20),
            LocalDate.of(2018, 6, 1),
            3500000,
            "Akademik"
        );

        t.printInfo();
    }
}