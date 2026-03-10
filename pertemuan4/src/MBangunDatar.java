public class MBangunDatar {
    public static void main(String[] args) {
        Persegi kotak = new Persegi(5.0, "Merah", "Solid");
        System.out.println();
        kotak.printInfo(); 
        System.out.println();
        Lingkaran bulat = new Lingkaran(15.0, "Biru", "Dashed"); 
        System.out.println();
        bulat.printInfo();
        System.out.println();
        kotak.setSisi(100.0);
        kotak.setWarna("Hijau");  
        System.out.println("Data Persegi Baru:");
        System.out.println("Sisi baru: " + kotak.getSisi());
        System.out.println("Warna baru: " + kotak.getWarna());
        System.out.println("Luas baru: " + kotak.getLuas());
    }
}