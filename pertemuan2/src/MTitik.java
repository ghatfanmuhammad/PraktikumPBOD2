// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class MTitik {
   public MTitik() {
   }

   public static void main(String[] var0) {
      Titik var1 = new Titik();
      var1.setAbsis((double)3.0F);
      var1.setOrdinat((double)4.0F);
      System.out.println("Bagian 1:");
      var1.printTitik();
      var1.geser((double)3.0F, (double)4.0F);
      var1.printTitik();
      System.out.println("Bagian 2:");
      System.out.println("Sebelum diubah:");
      var1.printTitik();
      var1.printTitik();
      var1.setAbsis((double)10.0F);
      var1.setOrdinat((double)10.0F);
      System.out.println("Setelah T1 diubah:");
      var1.printTitik();
      var1.printTitik();
      System.out.println("Bagian 3:");
      Titik var3 = new Titik();
      Titik var4 = new Titik((double)5.0F, (double)7.0F);
      var3.printTitik();
      var4.printTitik();
      System.out.println("Bagian 4");
      System.out.println("Jumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
      System.out.println("Bagian 5");
      Titik var5 = new Titik();
      var5.printTitik();
      Titik var6 = new Titik((double)5.0F, (double)7.0F);
      var6.printTitik();
      var6.setAbsis((double)10.0F);
      var6.setOrdinat((double)20.0F);
      var6.printTitik();
      System.out.println("\nJumlah objek Titik = " + Titik.getCounterTitik());
      System.out.println("Bagian 6");
      Titik var7 = new Titik((double)3.0F, (double)4.0F);
      System.out.println("Titik A:");
      var7.printTitik();
      System.out.println("Kuadran: " + var7.getKuadran());
      System.out.println("Jarak ke pusat: " + var7.getJarakPusat());
      Titik var8 = var7.getRefleksiX();
      System.out.println("Refleksi terhadap sumbu X :");
      var8.printTitik();
      System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
   }
}
