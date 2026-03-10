// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Garis {
   private Titik titikAwal;
   private Titik titikAkhir;
   private static int counterGaris = 0;

   public Garis() {
      this.titikAwal = new Titik((double)0.0F, (double)0.0F);
      this.titikAkhir = new Titik((double)1.0F, (double)1.0F);
      ++counterGaris;
   }

   public Garis(Titik var1, Titik var2) {
      this.titikAwal = var1;
      this.titikAkhir = var2;
      ++counterGaris;
   }

   public Titik getTitikAwal() {
      return this.titikAwal;
   }

   public Titik getTitikAkhir() {
      return this.titikAkhir;
   }

   public static int getCounterGaris() {
      return counterGaris;
   }

   public void setTitikAwal(Titik var1) {
      this.titikAwal = var1;
   }

   public void setTitikAkhir(Titik var1) {
      this.titikAkhir = var1;
   }

   public double getPanjang() {
      return this.titikAwal.getJarak(this.titikAkhir);
   }

   public double getGradien() {
      double var1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
      double var3 = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
      if (var1 == (double)0.0F) {
         throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
      } else {
         return var3 / var1;
      }
   }

   public Titik getTitikTengah() {
      double var1 = (this.titikAwal.getAbsis() + this.titikAkhir.getAbsis()) / (double)2.0F;
      double var3 = (this.titikAwal.getOrdinat() + this.titikAkhir.getOrdinat()) / (double)2.0F;
      return new Titik(var1, var3);
   }

   public boolean isSejajar(Garis var1) {
      return this.getGradien() == var1.getGradien();
   }

   public boolean isTegakLurus(Garis var1) {
      return this.getGradien() * var1.getGradien() == (double)-1.0F;
   }

   public void printGaris() {
      System.out.print("Titik Awal: ");
      this.titikAwal.printTitik();
      System.out.print("Titik Akhir: ");
      this.titikAkhir.printTitik();
   }

   public String getPersamaanGaris() {
      double var1 = this.getGradien();
      double var3 = this.titikAwal.getOrdinat() - var1 * this.titikAwal.getAbsis();
      return var3 >= (double)0.0F ? "y = " + var1 + "x + " + var3 : "y = " + var1 + "x - " + Math.abs(var3);
   }
}
