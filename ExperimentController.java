import java.util.*;
/**
 * Write a description of class ExperimentController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExperimentController
{
    public static void main(String[] args) {
        int input_max = 36;
        int customer_number = 1000;
        int casino_deposit = 0;
        int customer_allowance = 500;
        int eachBet = 20;
        ExperimentController ex = new ExperimentController();
        //CustomerContainer customerContaine = new CustomerContainer(customer_number, customer_allowance,input_max);
        //Casino casino1 = new Casino(input_max, casino_deposit, eachBet);
        //customerContaine.pick();
        //casino1.runSimulation();
        //casino1.payment(customerContaine);
        //System.out.println("deposit: " + casino1.deposit);
    }
    
    public static void mainNew(){
        Casino c = CasinoFactory.makeCasino(10, 100, "config_wheel_1.txt", "config_odds_1.txt");
        c.run();
    }
}
