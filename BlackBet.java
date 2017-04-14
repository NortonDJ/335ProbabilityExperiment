
/**
 * Write a description of class BlackBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackBet extends Bet
{
    public BlackBet(Gambler gambler, int amount){
        super(gambler, amount);
        this.type = "black";
    }
    
    public boolean isWinning(WheelSpace rouletteResult){
        return rouletteResult.isBlack();
    }
    
        public String toString(){
        String s = "";
        s+= "Black(" + amount +")";
        return s;
    }
}
