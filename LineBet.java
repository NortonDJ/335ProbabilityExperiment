import java.util.ArrayList;
/**
 * Write a description of class LineBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LineBet extends Bet
{
    protected ArrayList<WheelSpace> allSpaces;
    public LineBet(Gambler gambler, int amount, ArrayList<WheelSpace> spaces){
        super(gambler, amount);
        this.allSpaces = spaces;
        this.type = "line";
    }
    
    public boolean isWinning(WheelSpace w){
        return allSpaces.contains(w);
    }
}
