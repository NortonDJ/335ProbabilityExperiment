import java.util.*;
/**
 * Write a description of class Casino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casino
{
    int deposit;
    Random random = new Random();
    RouletteFactory roulette;
    int roulette_max;
    int eachBet;
    int result_num;
    String result_color;
    String result_odevity;
    
    /**
     * Constructor for objects of class Casino
     */
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
    public void payment(CustomerContainer cContainer){
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
    }
}
