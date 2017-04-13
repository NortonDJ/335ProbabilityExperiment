import java.util.*;
/**
 * Write a description of class Casino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casino
{
    private Wheel roulette;
    private ArrayList<Gambler> gamblers;
    private HashMap<String, Integer> odds;
    int balance;
    public Casino(Wheel roulette, ArrayList<Gambler> gamblers, HashMap<String, Integer> odds){
        this.balance = 0;
        this.roulette = roulette;
        this.gamblers = gamblers;
        this.odds = odds;
    }
    
    public Result run(){
        int i = 1;
        while(gamblersHaveMoney()){
            //System.out.println("Turn " + i);
            turn();
            i++;
        }
        //System.out.println("Simulation over\nBalance = " + balance); 
        return new Result(balance);
    }
    
    public boolean gamblersHaveMoney(){
        for(Gambler g : gamblers){
            if(g.hasMoney()){
                return true;
            }
        }
        return false;
    }
    
    public void turn(){
        ArrayList<Bet> bets = makeBets();
        WheelSpace winner = pickWinner();
        balance += handlePayouts(bets, winner);
    }
    
    public ArrayList<Bet> makeBets(){
        ArrayList<Bet> bets = new ArrayList<Bet>();
        for(Gambler g : gamblers){
            bets.add(g.makeBet());
        }
        return bets;
    }
    
    public WheelSpace pickWinner(){
        return roulette.spin();
    }
    
    public int handlePayouts(ArrayList<Bet> bets, WheelSpace winner){
        int amount = 0;
        for(Bet bet : bets){
            //collect the money from the bet
            amount += bet.getAmount();
            if(bet.isWinning(winner)){
                //calculate how much the gambler receives
                int winnings = getWinnings(bet);
                //remove the winnings from the amount
                amount -= winnings;
                //have the gambler save the money
                bet.getGambler().save(winnings);
            }
        }
        return amount;
    }
    
    public int getWinnings(Bet bet){
        try{
            //return odds * amount PLUS the amount they paid for the bet
            return bet.getAmount() * (1 + odds.get(bet.getType()));
        } catch (Exception e) {
            System.out.println("Trying to find winnings for undefined bet type. Exiting.");
            System.exit(-1);
        }
        return -1;
    }
    
    
    
    /*int deposit;
    Random random = new Random();
    RouletteFactory roulette;
    int roulette_max;
    int eachBet;
    int result_num;
    String result_color;
    String result_odevity;
    
    /**
     * Constructor for objects of class Casino
     *
    public Casino(int roulette_max, int deposit, int eachBet)
    {
        this.deposit = deposit;
        this.roulette_max = roulette_max;
        this.eachBet = eachBet;
        roulette = new RouletteFactory(roulette_max);
    }
    public Element runSimulation(){
        Wheel wheel = new Wheel();
        Element result = roulette.table.get(wheel.randomPick(0, roulette.number_of_elements()-1,random));
        result_num = result.get_number();
        result_color = result.get_color();
        result_odevity = result.get_odevity();
        
        System.out.println(result_num);
        System.out.println(result_color);
        System.out.println(result_odevity);
        return result;
    }
    /*public void payment(CustomerContainer cContainer){
        for(int i = 0; i < cContainer.sizeOfContainer(); i++){
            String temp = cContainer.getCustomer(i).getPick();
            if(temp.equals(result_num)||temp.equals(result_color)||temp.equals(result_color)){
                deposit = deposit - eachBet;
                cContainer.getCustomer(i).allowance = cContainer.getCustomer(i).allowance + eachBet;
            }
            else{
                deposit = deposit + eachBet;
                cContainer.getCustomer(i).allowance = cContainer.getCustomer(i).allowance - eachBet;
            }
        }
    }*/
}
