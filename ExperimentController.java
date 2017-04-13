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
        ArrayList<Integer> balances = new ArrayList<Integer>();
        int trials = 10000;
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(2531, 100, "config_wheel_1.txt", "config_odds_1.txt");
            Result r = c.run();
            balances.add(r.getBalance());
            if(i%(trials/10) == 0){
                System.out.println("Tenth done. Here's the most recent average: " + average(balances));
            }
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println("Average balance for casino: " + average(balances));
        balances = new ArrayList<Integer>();
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(2531, 100, "config_wheel_2.txt", "config_odds_1.txt");
            Result r = c.run();
            balances.add(r.getBalance());
            if(i%(trials/10) == 0){
                System.out.println("Tenth done. Here's the most recent average: " + average(balances));
            }
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println("Average balance for casino: " + average(balances));
    }

    public static long average(ArrayList<Integer> balances){
        long size = balances.size();
        if(size <= 0){
            return 0;
        }
        long sum = 0;
        for(Integer i : balances){
            sum += i;
        }
        return sum/size;
    }
}
