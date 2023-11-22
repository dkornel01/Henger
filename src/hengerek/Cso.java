
package hengerek;


public class Cso extends TomorHenger{
    double falvastagsag;
    public Cso(double fajsuly, double sugar, double magassag) {
        this(fajsuly, sugar, magassag,1);
    }
    public Cso(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag  + "sugar=" + getSugar()+ ", magassag=" + getMagassag() +  "fajsuly=" + getFajsuly() +'}';
    }
    
}
