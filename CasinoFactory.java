import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class CasinoFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasinoFactory
{
    /**
     * Constructor for objects of class CasinoFactory
     */
    public CasinoFactory()
    {
        
    }
    
    public static Casino makeCasino(int numGamblers, int startingAllowance, String wheelFile, String oddsFile){
        Wheel w = RouletteFactory.makeWheel(wheelFile);
        ArrayList<Gambler> gamblers = new ArrayList<Gambler>();
        for(int i = 0; i < numGamblers; i++){
            gamblers.add(new Gambler(startingAllowance));
        }
        HashMap<String, Integer> odds = OddsFactory.makeOdds(oddsFile);
        CasinoComponents c = CasinoComponents.getInstance();
        c.setWheel(w);
        c.setGamblers(gamblers);
        c.setOdds(odds);
        return new Casino(w, gamblers, odds);
    }
}
