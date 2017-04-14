import java.util.*;
/**
 * Write a description of class ExperimentController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExperimentController
{
    public static void main(String[] args){
        ExperimentController.run(100000, 1, 1, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 1, 100, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 100, 1, "config_wheel_1.txt", "config_odds_1.txt");

        ExperimentController.run(5000, 2531, 390, "config_wheel_1.txt", "config_odds_1.txt");
        //ExperimentController.run(5000, 2531, 350, "config_wheel_2.txt", "config_odds_1.txt");
    }

    public static void run(int trials, int students, int allowance, String wheelFile, String oddsFile){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("STUDENTS: " + students);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println();
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(students, allowance, wheelFile, oddsFile);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println("Average balance for casino: " + average(balances));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static double average(ArrayList<Integer> balances){
        long size = balances.size();
        if(size <= 0){
            return 0;
        }
        long sum = 0;
        for(Integer i : balances){
            sum += i;
        }
        return sum/(double)size;
    }
}
