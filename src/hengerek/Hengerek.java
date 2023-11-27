
package hengerek;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Hengerek {

    static private ArrayList<Henger> hengerek=new ArrayList<Henger>(5);
    public static void main(String[] args) {
        HengerProgram();
    }

    static private  void HengerProgram() {
        run();
    }

    static private  void run() {
        hengerek=lista();
        System.out.println(csovekSulya());
        System.out.println(atlagterfogat());
            for (int i=0;i<hengerek.size();i++){
                Henger egy = hengerek.get(i);
                System.out.println(egy.toString());
            }
    }

    static public  double csovekSulya() {
        double atlag=0;
            for (int i=0;i<hengerek.size();i++){
                if (hengerek.get(i)==hengerek.get(4)){; 
                Cso egy = (Cso) hengerek.get(i);
                atlag+=egy.suly();
                }
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
    

    static private  ArrayList<Henger> lista() {
        hengerek.add(0,new Henger(3,4));
        hengerek.add(1,new TomorHenger(3,4,3));
        hengerek.add(2,new TomorHenger(3,4));
        hengerek.add(3,new Cso(3,4,3));
        hengerek.add(4,new Cso(3,4,4,5));
        return hengerek;
    }
    
}
