
/**
 * Write a description of class Gambler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gambler
{
    private int balance;
    private int savings;
    private BettingStrategy strat;
    
    public Gambler(int balance){
        this.balance = balance;
        this.savings = 0;
        this.strat = new DefaultStrategy(this);
    }
    
    public void save(int winnings){
        this.savings += winnings;
    }
    
    public boolean hasMoney(){
        return this.balance > 0;
    }
    
    public Bet makeBet(){
        return strat.choose();
    }
    
    public int getBalance(){
        return this.balance;
    }
    
    public void removeBalance(int balanceToRemove){
        this.balance -= balanceToRemove;
    }
}
