// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;

public class MGaris {
   public MGaris() {
   }

   public static void main(String[] var0) {
      System.out.println("Bagian 1:");
      Titik var1 = new Titik((double)-2.0F, (double)0.0F);
      Titik var2 = new Titik((double)0.0F, (double)4.0F);
      Garis var3 = new Garis(var1, var2);
      var3.printGaris();
      System.out.println("Panjang: " + var3.getPanjang());
      System.out.println("Gradien: " + var3.getGradien());
      Titik var4 = var3.getTitikTengah();
      System.out.print("Titik Tengah: ");
      var4.printTitik();
      System.out.println("Persamaan: " + var3.getPersamaanGaris());
      System.out.println("Bagian 2:");
      Garis var5 = new Garis();
      var5.printGaris();
      System.out.println("Panjang: " + var5.getPanjang());
      System.out.println("Gradien: " + var5.getGradien());
      System.out.println("Bagian 3:");
      System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
      System.out.println("Bagian 4:");
      Garis var6 = new Garis();
      var6.setTitikAwal(new Titik((double)1.0F, (double)2.0F));
      var6.setTitikAkhir(new Titik((double)3.0F, (double)6.0F));
      var6.printGaris();
      System.out.println("Persamaan: " + var6.getPersamaanGaris());
      System.out.println("Bagian 5:");
      Titik var7 = new Titik((double)1.0F, (double)1.0F);
      Titik var8 = new Titik((double)3.0F, (double)5.0F);
      Garis var9 = new Garis(var7, var8);
      PrintStream var10000 = System.out;
      boolean var10001 = var3.isSejajar(var9);
      var10000.println("Apakah G1 sejajar G4? " + var10001);
      System.out.println("Bagian 6:");
      Titik var10 = new Titik((double)0.0F, (double)0.0F);
      Titik var11 = new Titik((double)2.0F, (double)-1.0F);
      Garis var12 = new Garis(var10, var11);
      var10000 = System.out;
      var10001 = var3.isTegakLurus(var12);
      var10000.println("Apakah G1 tegak lurus G5? " + var10001);
      System.out.println("Bagian 7:");
      System.out.println("Total objek Garis yang dibuat: " + Garis.getCounterGaris());
   }
}
