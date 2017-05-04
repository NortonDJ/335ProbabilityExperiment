import java.util.*;
import java.io.*;
/**
 * Write a description of class ExperimentController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExperimentController
{
    public static void main(String[] args){
        //ExperimentController.run(100000,10,1000, "config_wheel_3.txt", "config_odds_1.txt");
        //ExperimentController.demo();
	ExperimentController.runSuite(100000, 2531, 390, "output_dist_4.csv");
	ExperimentController.greenSuite(1000, 2531, 195, "output_green_4.csv", 200, 1);
        ExperimentController.carveSuite(1000, 2531, 195, "output_carve_4.csv", "00", 200, 1); 
	ExperimentController.oddsSuite(1000, 2531, 195, "output_odds_4.csv", "single", 200, 1);
	//ExperimentController.run(1000,10,1000, "config_wheel_1.txt", "config_odds_1.txt");
	//ExperimentController.greenSpaces(1000,10,1000, "config_wheel_1.txt", "config_odds_1.txt", 500, 1);
    	//ExperimentController.carveSpaces(1000,10,1000, "config_wheel_1.txt", "config_odds_1.txt", "00", 25);
    	//ExperimentController.changeOdds(1000,10,1000, "config_wheel_1.txt", "config_odds_1.txt", "single", 10);
    }

    public static void demo(){
        ExperimentController.run(100000, 1, 1, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 1, 100, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 100, 1, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(5000, 2531, 390, "config_wheel_1.txt", "config_odds_1.txt");
    }

    public static void runSuite(int trials, int students, int allowance, String outputFile){
	try{
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A RUN SUITE");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("STUDENTS: " + students);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println();
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " students = " + students + " allowance = " + allowance + "\n"); 
        writer.write("balance\n");
        for(int i = 0; i < trials; i++){
	    if((trials/100) == i){
		System.out.println("Trial: " + i);
	    }
            Casino c = CasinoFactory.makeCasino(students, allowance, "config_wheel_1.txt", "config_odds_1.txt");
            Result r = c.run();
            balances.add(r.getBalance());
            writer.write(r.getBalance() + "\n");
	    writer.flush();
        }
        double average = average(balances);
        writer.write("," + average + "," + variance(balances, average)+ "\n");
	writer.flush();
	writer.close();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        } catch(Exception e){
                e.printStackTrace();
                System.exit(1);
        }

    }

    public static void run(int trials, int students, int allowance, String wheelFile, String oddsFile){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CUSTOMIZED SIM");
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
        System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void greenSuite(int trials, int students, int allowance, String outputFile, int maxSpaces, int increment){
    try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A GREEN SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    FileWriter writer = new FileWriter(new File(outputFile));
    writer.write("trials = " + trials + " students = " + students + " allowance = " + allowance + "\n"); 
        writer.write("numberOfSpaces, average, variance\n");
    for(int j = 0; j <= maxSpaces; j = j + increment){
            System.out.println("Max Spaces: " + j);
        ArrayList<Integer> balances = new ArrayList<Integer>();
        for(int i = 0; i < trials; i++){      
                    Casino c = CasinoFactory.makeCasino(students, allowance, "config_wheel_1.txt", "config_odds_1.txt");
                    CasinoComponents.getInstance().getWheel().addGreenSpaces(j, 1);
                    Result r = c.run();
                    balances.add(r.getBalance());
            }
            double average = average(balances);
        double variance = variance(balances, average);
        balances.clear();
            writer.write("" + j + "," + average + "," + variance +"\n");
    }
    writer.flush();
    writer.close();
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    } catch (Exception e){
        e.printStackTrace();
        System.exit(1);
    }
    }

    public static void greenSpaces(int trials, int students, int allowance, String wheelFile, String oddsFile, int n, int size){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A GREEN SPACES SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("STUDENTS: " + students);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
    System.out.println("ADDITIONAL GREEN SPACES: " + n);
    System.out.println("SIZE OF EACH GREEN SPACE: " + size);
        System.out.println(); 
    for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(students, allowance, wheelFile, oddsFile);
        CasinoComponents.getInstance().getWheel().addGreenSpaces(n, size);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void carveSuite(int trials, int students, int allowance, String outputFile, String value, int maxSize, int increment){
        try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CARVE SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " students = " + students + " allowance = " + allowance + "\n"); 
        writer.write("size, average, variance\n");
        for(int j = 0; j <= maxSize; j = j + increment){
                System.out.println("Max Size: " + j);
                ArrayList<Integer> balances = new ArrayList<Integer>();
                for(int i = 0; i < trials; i++){      
                        Casino c = CasinoFactory.makeCasino(students, allowance, "config_wheel_1.txt", "config_odds_1.txt");
                        CasinoComponents.getInstance().getWheel().carve(value, j);
                        Result r = c.run();
                        balances.add(r.getBalance());
                }
                double average = average(balances);
                double variance = variance(balances, average);
                balances.clear();
        writer.write("" + j + "," + average + "," + variance+"\n");
        }
    writer.flush();
    writer.close();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        } catch (Exception e){
                e.printStackTrace();
                System.exit(1);
        }

    }

    public static void carveSpaces(int trials, int students, int allowance, String wheelFile, String oddsFile, String value, int size){
       ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CARVE SPACES SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("STUDENTS: " + students);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println("VALUE TO CARVE: " + value);
        System.out.println("NEW SIZE OF VALUE: " + size);
        System.out.println(); 
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(students, allowance, wheelFile, oddsFile);
            CasinoComponents.getInstance().getWheel().carve(value, size);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void oddsSuite(int trials, int students, int allowance, String outputFile, String type, int maxOdd, int increment){
        try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING AN ODDS SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " students = " + students + " allowance = " + allowance + "\n"); 
        writer.write("odd, average, variance\n");
        for(int j = 0; j <= maxOdd; j = j + increment){
                System.out.println("Max Odd: " + j);
                ArrayList<Integer> balances = new ArrayList<Integer>();
                for(int i = 0; i < trials; i++){      
                        Casino c = CasinoFactory.makeCasino(students, allowance, "config_wheel_1.txt", "config_odds_1.txt");
                        c.setOdds(type, j);
                        Result r = c.run();
                        balances.add(r.getBalance());
                }
                double average = average(balances);
                double variance = variance(balances, average);
        balances.clear();
                writer.write("" + j + "," + average + "," + variance +"\n");
        }
        writer.flush();
        writer.close();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        } catch (Exception e){
                e.printStackTrace();
                System.exit(1);
        }

    }

    public static void changeOdds(int trials, int students, int allowance, String wheelFile, String oddsFile, String type, int odd){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CHANGE ODDS SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("STUDENTS: " + students);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println("ODD TYPE TO CHANGE: " + type);
        System.out.println("NEW ODD: " + odd);
        System.out.println(); 
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(students, allowance, wheelFile, oddsFile);
            c.setOdds(type, odd);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
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
    
    public static double variance(ArrayList<Integer> balances, double average){
        long size = balances.size();
        if(size <= 0){
            return 0;
        }
        double sum = 0;
        for(Integer i : balances){
            sum += Math.pow((i - average),2);
        }
        return sum/((double)(size-1));
    }
}
