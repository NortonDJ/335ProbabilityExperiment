
/**
 * Abstract class BettingStrategy - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BettingStrategy implements StrategyInterface
{
    protected Gambler gambler;
    
    public BettingStrategy(Gambler gambler){
        this.gambler = gambler;
    }
}
