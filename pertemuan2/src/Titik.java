public class Titik {
   double absis;
   double ordinat;
   static int counterTitik = 0;

   public Titik(double var1, double var3) {
      this.absis = var1;
      this.ordinat = var3;
      ++counterTitik;
   }

   public Titik() {
      this((double)0.0F, (double)0.0F);
   }

   public static int getCounterTitik() {
      return counterTitik;
   }

   public double getAbsis() {
      return this.absis;
   }

   public double getOrdinat() {
      return this.ordinat;
   }

   public void setAbsis(double var1) {
      this.absis = var1;
   }

   public void setOrdinat(double var1) {
      this.ordinat = var1;
   }

   public void geser(double var1, double var3) {
      this.absis += var1;
      this.ordinat += var3;
   }

   public int getKuadran() {
      if (this.absis > (double)0.0F && this.ordinat > (double)0.0F) {
         return 1;
      } else if (this.absis < (double)0.0F && this.ordinat > (double)0.0F) {
         return 2;
      } else if (this.absis < (double)0.0F && this.ordinat < (double)0.0F) {
         return 3;
      } else {
         return this.absis > (double)0.0F && this.ordinat < (double)0.0F ? 4 : 0;
      }
   }

   public double getJarakPusat() {
      return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
   }

   public double getJarak(Titik var1) {
      double var2 = this.absis - var1.absis;
      double var4 = this.ordinat - var1.ordinat;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public void refleksiX() {
      this.ordinat = -this.ordinat;
   }

   public void refleksiY() {
      this.absis = -this.absis;
   }

   public Titik getRefleksiX() {
      return new Titik(this.absis, -this.ordinat);
   }

   public Titik getRefleksiY() {
      return new Titik(-this.absis, this.ordinat);
   }

   public void printTitik() {
      System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
   }
}
