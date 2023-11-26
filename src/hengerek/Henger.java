
package hengerek;


public class Henger extends Hengerek{
    static int HengerDarab;
    private double sugar,magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDarab() {
        return HengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    public double terfogat(){
        double megoldas=sugar*sugar*3.14*magassag;
        return megoldas;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
    
}
