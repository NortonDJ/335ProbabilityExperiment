import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class CasinoComponentsSingleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasinoComponents
{
    private Wheel wheel;
    private ArrayList<Gambler> gamblers;
    private HashMap<String, Integer> odds;
    private static CasinoComponents instance;
    
    public static CasinoComponents getInstance(){
        if(instance == null){
            instance = new CasinoComponents();
        } 
        return instance;
    }
    
    public void setGamblers(ArrayList<Gambler> gamblers){
        this.gamblers = gamblers;
    }
    
    public void setOdds(HashMap<String, Integer> odds){
        this.odds = odds;
    }
    
    public void setWheel(Wheel w){
        this.wheel = w;
    }
    
    public ArrayList<Gambler> getGamblers(){
        return this.gamblers;
    }
    
    public HashMap<String, Integer> getOdds(){
        return this.odds;
    }
    
    public Wheel getWheel(){
        return this.wheel;
    }
    
    public static void reset(){
        instance = null;
    }
}
