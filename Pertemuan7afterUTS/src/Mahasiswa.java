// NIM       : 24060124140171
// Deskripsi : Soal 2 - Polimorfisme Ad Hoc Overloading
// Nama      : Ghatfan Muhammad Atiwiar
// Tanggal   : Selasa 21 April 2026


public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    public Mahasiswa() {
        this.NIM          = "-999";
        this.Nama         = "n/a";
        this.ProgramStudi = "n/a";
    }

    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM          = NIM;
        this.Nama         = Nama;
        this.ProgramStudi = ProgramStudi;
    }
    public Mahasiswa(Mahasiswa lain) {
        this.NIM          = lain.NIM;
        this.Nama         = lain.Nama;
        this.ProgramStudi = lain.ProgramStudi;
    }
    public String getNIM()          { return NIM; }
    public String getNama()         { return Nama; }
    public String getProgramStudi() { return ProgramStudi; }

    public void setNIM(String NIM)   { this.NIM  = NIM; }
    public void setNama(String Nama) { this.Nama = Nama; }

    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }
    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa lain) {
        this.ProgramStudi = lain.ProgramStudi;
    }
    // Tampilkan data mahasiswa
    public void tampilData() {
        System.out.println("  NIM          : " + NIM);
        System.out.println("  Nama         : " + Nama);
        System.out.println("  Program Studi: " + ProgramStudi);
    }
}