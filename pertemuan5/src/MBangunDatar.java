public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("PERSEGI");
        Persegi p1 = new Persegi(10.0, "Biru", "Solid");
        p1.printInfo();
        System.out.println("Luas Awal: " + p1.getLuas());
        p1.zoomIn();
        System.out.println("Luas setelah zoomIn (110%): " + p1.getLuas());
        p1.zoom(50);
        System.out.println("Luas setelah zoom 50%: " + p1.getLuas());
        System.out.println("\nLINGKARAN");
        Lingkaran l1 = new Lingkaran(14.0, "Merah", "Dotted");
        l1.printInfo();
        System.out.println("Luas Awal: " + l1.getLuas());
        l1.zoomOut();
        System.out.println("Luas setelah zoomOut (90%): " + l1.getLuas());
        System.out.println("\nPOLYMORPHISM & COMPARISON");
        BangunDatar p2 = new Persegi(5.0, "Hijau", "Solid");
        System.out.println("Luas p1 = p2 ? " + p1.isEqualLuas(p2));
        System.out.println("\nCOUNTER");
        BangunDatar.printCounterBangunDatar();
    }
}