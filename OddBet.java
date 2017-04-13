
/**
 * Write a description of class OddBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OddBet extends Bet
{
    public OddBet(Gambler gambler, int amount){
        super(gambler, amount);
        this.type = "odd";
    }
    
    public boolean isWinning(WheelSpace rouletteResult){
        return rouletteResult.isOdd();
    }
}
