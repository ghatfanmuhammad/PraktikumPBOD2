 //*Nama file : Titik.java
 //Deskripsi : berisi atribut dan method dalam class Titik
 //Pembuat     : Ghatfan Muhammad Atiwiar
 //Tanggal     : 20 Februari 2026
 //

public class Titik {
    /************** ATRIBUT **************/
    double absis;
    double ordinat;
    static int countertitik = 0;

    /************** METHOD **************/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik++;
    }


    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengeluarkan letak kuadran titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }

    // Jarak dari titik pusat
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // Jarak antar titik
    double getJarak(Titik T1) {
        return Math.sqrt(Math.pow((this.absis - T1.absis),2) + Math.pow((this.ordinat - T1.ordinat),2));
    }


    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    static int getCounterTitik(){
        return countertitik;
    }
} // end class Titik


