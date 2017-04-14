import java.util.ArrayList;
/**
 * Write a description of class GroupBet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroupBet extends Bet
{
    protected ArrayList<WheelSpace> allSpaces;
    public GroupBet(Gambler gambler, int amount, ArrayList<WheelSpace> spaces){
        super(gambler, amount);
        this.allSpaces = spaces;
        this.type = "group";
    }
    
    public boolean isWinning(WheelSpace w){
        return allSpaces.contains(w);
    }
    
    public String toString(){
        String s = "";
        s+= "Group(" + amount +"," + allSpaces + ")";
        return s;
    }
}
