 //*Nama file : Titik.java
 //Deskripsi : berisi atribut dan method dalam class Titik
 //Pembuat     : Ghatfan Muhammad Atiwiar
 //Tanggal     : 20 Februari 2026
 //
public class MTitikk {
    public static void main(String[] args) {
        Titikk T1 = new Titikk(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(105); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(686699); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(2345678, 41237); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser
    }
}
