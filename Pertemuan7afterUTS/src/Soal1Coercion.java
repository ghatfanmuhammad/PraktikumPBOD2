// NIM       : 24060124140171
// Deskripsi : Soal 1 - Polimorfisme Ad Hoc Coercion
// Nama      : Ghatfan Muhammad Atiwiar
// Tanggal   : Selasa 21 April 2026

public class Soal1Coercion {
    public static void main(String[] args) {
        // 1a. Ilustrasi konversi tipe dasar
        System.out.println("1a. Konversi Tipe Dasar ");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        System.out.println("Sebagai integer : " + nilaiInt);
        System.out.println("Sebagai karakter: " + nilaiChar);
        System.out.println("Sebagai real    : " + nilaiDouble);
        // 1b. Konversi real -> integer di variabel baru
        System.out.println("\n1b. Konversi Real ke Integer");
        double angkaReal = 65.0;
        int angkaIntBaru = (int) angkaReal;
        System.out.println("Nilai real  : " + angkaReal);
        System.out.println("Nilai int   : " + angkaIntBaru);

        // 1c. String X="1234", Y="5678"
        // S = konkatenasi X+Y
        // Z = penjumlahan angka X+Y
        System.out.println("\n1c. String Integer X dan Y");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;                            
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);
        // 1d. String P="12.34", Q="56.78"
        // R = konkatenasi P+Q
        // D = penjumlahan angka P+Q
        System.out.println("\n1d. String Double P dan Q");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;                             
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        // 1e. Objek Integer A dari hasil konversi S
        System.out.println("\n1e. Integer A dari String S ");
        Integer A = Integer.parseInt(S);
        System.out.println("S = " + S);
        System.out.println("A = " + A);

        // 1f. Objek String T dari hasil konversi A
        System.out.println("\n1f. String T dari Integer A ");
        String T = A.toString();
        System.out.println("A = " + A);
        System.out.println("T = " + T);
    }
}