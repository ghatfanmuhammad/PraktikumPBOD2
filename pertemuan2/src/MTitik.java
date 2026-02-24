 //*Nama file : Titik.java
 //Deskripsi : berisi atribut dan method dalam class Titik
 //Pembuat     : Ghatfan Muhammad Atiwiar
 //Tanggal     : 20 Februari 2026
 //
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,-5);

        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounterTitik());


        T1.setAbsis(3); // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3, 4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        
        System.out.println("Jarak Pusat T1: " + T1.getJarakPusat());
        System.out.println("Jarak Pusat T2: " + T2.getJarakPusat());

        System.out.println("Jarak T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Jarak T1 dan T2: " + T2.getJarak(T1));
        
        T1.printTitik();
        T2.printTitik();
    }
}
