
/**
 * Write a description of class EvenBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvenBet extends Bet
{
    public EvenBet(Gambler gambler, int amount){
        super(gambler, amount);
        this.type = "even";
    }
    
    public boolean isWinning(WheelSpace rouletteResult){
        return rouletteResult.isEven();
    }
    
    public String toString(){
        String s = "";
        s+= "Even(" + amount +")";
        return s;
    }
}
