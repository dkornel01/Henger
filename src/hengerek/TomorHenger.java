
package hengerek;

import java.awt.Color;


public class TomorHenger extends Henger{
    private double fajsuly;
    
    public TomorHenger(double sugar, double magassag){
        this(sugar,magassag,1);
    }
    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }
    
    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public double terfogat() {
        return super.terfogat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public double suly(){
        double egy=fajsuly/(getMagassag()*getMagassag()*getMagassag());
        return egy;
    }
    
    @Override
    public String toString() {
        return "TomorHenger{" + "sugar=" + getSugar()+ ", magassag=" + getMagassag() +  "fajsuly=" + fajsuly + '}';
    }
    
}
