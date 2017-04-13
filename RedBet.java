
/**
 * Write a description of class RedBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBet extends Bet
{
    public RedBet(Gambler gambler, int amount){
        super(gambler, amount);
        this.type = "red";
    }
    
    public boolean isWinning(WheelSpace rouletteResult){
        return rouletteResult.isRed();
    }
}
