// Source code is decompiled from a .class file using FernFlower decompiler.
public class mrbob1 {
   public mrbob1() {
   }

   public double SimpleInterest(double Principle, double Rate, double Time) {
      return Principle * Rate * Time / 100.0;
   }

   public static void main(String[] args) {
      mrbob1 bob = new mrbob1();
      double interest = bob.SimpleInterest(100000.0, 5.0, 5.0);
      System.out.println("The principle amount: 100,000 Rwandan Francs");
      System.out.println("The Rate: 5%");
      System.out.println("Number of years: 5 years");
      System.out.println("The simple interest is " + interest + " Rwandan Francs");
   }
}
