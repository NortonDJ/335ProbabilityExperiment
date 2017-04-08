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
    
    int result_num;
    String result_color;
    String result_odevity;
    
    /**
     * Constructor for objects of class Casino
     */
    public Casino(int roulette_max, int deposit)
    {
        this.deposit = deposit;
        this.roulette_max = roulette_max;
        roulette = new RouletteFactory(roulette_max);
    }
    public Element runSimulation(){
        Wheel wheel = new Wheel();
        Element result = roulette.table.get(wheel.randomPick(0, roulette.number_of_elements(),random));
        result_num = result.get_number();
        result_color = result.get_color();
        result_odevity = result.get_odevity();
        return result;
    }
}
