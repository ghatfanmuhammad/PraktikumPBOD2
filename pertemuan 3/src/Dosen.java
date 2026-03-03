public class Dosen {
    private String nip;
    private String nama ;
    private String prodi;

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen (String Nip, String Nama, String Prodi){
        nip = Nip;
        nama = Nama;
        prodi = Prodi;
    }

    public void Setnama(String Nama){
        nama = Nama;
    }
    
    public void Setnip(String Nip){
        nip = Nip;
    }
    
    public void Setprodi(String Prodi){
        prodi = Prodi;
    }

    public String getNip() {
        return nip;
    }
    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }


}
