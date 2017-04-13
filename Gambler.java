
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
    
    public Gambler(int balance){
        this.balance = balance;
        this.savings = 0;
    }
    
    public void save(int winnings){
        this.savings += winnings;
    }
    
    public boolean hasMoney(){
        return this.balance > 0;
    }
    
    public Bet makeBet(){
        int toBet = 0;
        if(balance > 0){
            toBet = 1;
            balance -= toBet;
        }
        return new EvenBet(this,toBet);
    }
    
}
