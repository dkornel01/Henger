
package hengerek;


public class TomorHenger extends Henger{
    private double fajsuly;
    
    public TomorHenger(double sugar, double magassag){
        this(sugar,magassag,1);
    }
    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }
    private double suly(){
        return 0;
    }
    
    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "sugar=" + getSugar()+ ", magassag=" + getMagassag() +  "fajsuly=" + fajsuly + '}';
    }
    
}
