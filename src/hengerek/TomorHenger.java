
package hengerek;


public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        double fajsuly = 1;
        TomorHenger(sugar,magassag,fajsuly);
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

   
    
}
