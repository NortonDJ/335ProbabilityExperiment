
/**
 * Write a description of class SingleBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleBet extends Bet
{
    private WheelSpace space;
    
    public SingleBet(Gambler gambler, int amount, WheelSpace w){
        super(gambler, amount);
        this.space = w;
        this.type = "single";
    }
    
    public boolean isWinning(WheelSpace rouletteResult){
        return space == rouletteResult;
    }
}
