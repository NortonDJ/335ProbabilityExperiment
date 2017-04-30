import java.util.*;
/**
 * Write a description of class Customers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    //the amount of money customers use to play
    int allowance;
    
    int max_num;
    String pick;
    ArrayList<String> all_choices;
    public Customer(int allowance, int max_num)
    {
        this.allowance = allowance;
        this.max_num = max_num;
        all_choices =  new ArrayList<String>();
        for(int i = 0; i<= max_num; i++){
            all_choices.add(Integer.toString(i));
        }
        all_choices.add("00");
        all_choices.add("1st half");
        all_choices.add("2nd half");
        all_choices.add("red");
        all_choices.add("black");
    }

    /**
     * Customer picks from 3 ways to make their decision: 
     * single numbers, 1st/2nd/3rd 12, first/second half, red/black, 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String selection()
    {
        Random rand = new Random();
        Wheel wheel = new Wheel();
        int temp = wheel.randomPick(0, all_choices.size()-1, rand);
        pick = all_choices.get(temp);
        return pick;
    }
    public String getPick(){
        return pick;
    }
}
