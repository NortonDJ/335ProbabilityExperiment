
/**
 * Abstract class Bet - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Bet implements BetInterface
{
    protected int amount;
    protected Gambler gambler;
    protected String type = "UNDEFINED";
    
    public Bet(Gambler gambler, int amount){
        this.amount = amount;
        this.gambler = gambler;
    }
    
    public Gambler getGambler(){
        return this.gambler;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public String getType(){
        return this.type;
    }
}
