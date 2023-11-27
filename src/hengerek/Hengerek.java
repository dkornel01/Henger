
package hengerek;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Hengerek {

    static private ArrayList<Henger> hengerek;
    public static void main(String[] args) {
        HengerProgram();
    }

    static private  void HengerProgram() {
        run();
    }

    static private  void run() {
        HengerProgram();
        csovekSulya();
        atlagterfogat();
        lista();
    }

    static public  double csovekSulya() {
        double atlag=0;
            for (int i=0;i<hengerek.size();i++){
                Cso egy = (Cso) hengerek.get(i);
                atlag+=egy.suly();
            }
            return atlag;
    }

    static public  double atlagterfogat() {
        double atlag=0;
            for (int i=0;i<hengerek.size();i++){
                Henger egy = hengerek.get(i);
                atlag+=egy.terfogat();
            }
            atlag=atlag/6;
            return atlag;
    }

    static private  void lista() {
        for (int i=0;i<hengerek.size();i++){
                Henger egy = hengerek.get(i);
                System.out.println(egy.toString());
            }
    }
    
}
