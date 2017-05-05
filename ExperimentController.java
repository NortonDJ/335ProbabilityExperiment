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
	if(args.length == 0){
		System.out.println("Please rerun the program with one of the following: ");
		System.out.println("demo, standard, green, carve, odds, " +
		"run-suite, green-suite, carve-suite, odds-suite");
		System.exit(1);
	} else {
		String arg0 = args[0];
		switch(arg0){
        	case "demo": {
			ExperimentController.demo(); 
			break;
		}
		case "standard": {
			try{
				int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				ExperimentController.run(trials, gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt");
				break;
			} catch (Exception e){
				System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
				"standard <trials> <gamblers> <allowance>");
				System.exit(1);
			}
		}
		case "green": {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int numberOfSpaces = Integer.parseInt(args[4]);
				int sizeOfSpace = Integer.parseInt(args[5]);
				ExperimentController.greenSpaces(trials, gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt", numberOfSpaces, sizeOfSpace);
				break;	
			}
			catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "green <trials> <gamblers> <allowance> <number of spaces> <size of each space>");
                                System.exit(1);
                        }
		}
		case "carve": {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int newSize = Integer.parseInt(args[5]);
                                ExperimentController.carveSpaces(trials, gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt", args[4], newSize);
                        	break;
			}
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "carve <trials> <gamblers> <allowance> <value to carve> <new size of value>");
                                System.exit(1);
                        }

		}
		case "odds" : {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int newValue = Integer.parseInt(args[5]);
                                ExperimentController.changeOdds(trials, gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt", args[4], newValue);
                        	break;
			}
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "odds <trials> <gamblers> <allowance> <type of odd to change> <new value of odd>");
                                System.exit(1);
                        }

		}
		case "run-suite" : {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
                                ExperimentController.runSuite(trials, gamblers, allowance, args[4]);
				break;
                        }
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: " + 
                                "green <trials> <gamblers> <allowance> <output file>");
                                System.exit(1);
                        }

		}
		case "green-suite" : {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int maxSpaces = Integer.parseInt(args[5]);
				int increment = Integer.parseInt(args[6]);
                                ExperimentController.greenSuite(trials, gamblers, allowance, args[4], maxSpaces, increment);
				break;
                        }
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "green-suite <trials> <gamblers> <allowance> <output file> <max spaces> <increment>");
                                System.exit(1);
                        }
		}
		case "carve-suite" : {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int maxSize = Integer.parseInt(args[6]);
				int increment = Integer.parseInt(args[7]);
                                ExperimentController.carveSuite(trials, gamblers, allowance, args[4], args[5],  maxSize, increment);
                                break;
                        }
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "carve-suite <trials> <gamblers> <allowance> <output file> <value to carve> <max size> <increment>");
                                System.exit(1);
                        }
		}
		case "odds-suite" : {
			try{
                                int trials = Integer.parseInt(args[1]);
                                int gamblers = Integer.parseInt(args[2]);
                                int allowance = Integer.parseInt(args[3]);
				int maxOdd = Integer.parseInt(args[6]);
				int increment = Integer.parseInt(args[7]);
                                ExperimentController.oddsSuite(trials, gamblers, allowance, args[4], args[5], maxOdd, increment);
                                break;
                        }
                        catch (Exception e){
                                System.out.println("Error parsing arguments, please re-run replacing brackets with params: \n" + 
                                "odds-suite <trials> <gamblers> <allowance> <output file> <odd to change> <max odd> <increment>");
                                System.exit(1);
                        }
		}
		}
	}
     }
//ExperimentController.run(50000, 2531, 650, "config_wheel_1.txt", "config_odds_1.txt");
	//ExperimentController.runSuite(50000, 2531, 650, "output_dist_4.csv");
//	ExperimentController.greenSuite(5000, 2531, 325, "output_green_4.csv", 200, 1);
//        ExperimentController.carveSuite(5000, 2531, 325, "output_carve_4.csv", "00", 200, 1); 
//	ExperimentController.oddsSuite(5000, 2531, 325, "output_odds_4.csv", "single", 200, 1);

    public static void demo(){
        ExperimentController.run(100000, 1, 1, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 1, 100, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(100000, 100, 1, "config_wheel_1.txt", "config_odds_1.txt");
        ExperimentController.run(50000, 2531, 730, "config_wheel_1.txt", "config_odds_1.txt");
    }

    public static void runSuite(int trials, int gamblers, int allowance, String outputFile){
	try{
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A RUN SUITE");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("GAMBLERS: " + gamblers);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println();
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " gamblers = " + gamblers + " allowance = " + allowance + "\n"); 
        writer.write("balance\n");
        for(int i = 0; i < trials; i++){
	                if( i%100 == 0){
                System.out.println("Trial: " + i);
            }

            Casino c = CasinoFactory.makeCasino(gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt");
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

    public static void run(int trials, int gamblers, int allowance, String wheelFile, String oddsFile){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CUSTOMIZED SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("GAMBLERS: " + gamblers);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println();
        for(int i = 0; i < trials; i++){
	    if( i%100 == 0){
		System.out.println("Trial: " + i);
	    }
            Casino c = CasinoFactory.makeCasino(gamblers, allowance, wheelFile, oddsFile);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        //System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void greenSuite(int trials, int gamblers, int allowance, String outputFile, int maxSpaces, int increment){
    try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A GREEN SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    FileWriter writer = new FileWriter(new File(outputFile));
    writer.write("trials = " + trials + " gamblers = " + gamblers + " allowance = " + allowance + "\n"); 
        writer.write("numberOfSpaces, average, variance\n");
    for(int j = 0; j <= maxSpaces; j = j + increment){
            System.out.println("Max Spaces: " + j);
        ArrayList<Integer> balances = new ArrayList<Integer>();
        for(int i = 0; i < trials; i++){      
                    if( i%100 == 0){
                System.out.println("Trial: " + i);
            }
   
	         Casino c = CasinoFactory.makeCasino(gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt");
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

    public static void greenSpaces(int trials, int gamblers, int allowance, String wheelFile, String oddsFile, int n, int size){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A GREEN SPACES SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("GAMBLERS: " + gamblers);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
    System.out.println("ADDITIONAL GREEN SPACES: " + n);
    System.out.println("SIZE OF EACH GREEN SPACE: " + size);
        System.out.println(); 
    for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(gamblers, allowance, wheelFile, oddsFile);
        CasinoComponents.getInstance().getWheel().addGreenSpaces(n, size);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        //System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void carveSuite(int trials, int gamblers, int allowance, String outputFile, String value, int maxSize, int increment){
        try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CARVE SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " gamblers = " + gamblers + " allowance = " + allowance + "\n"); 
        writer.write("size, average, variance\n");
        for(int j = 0; j <= maxSize; j = j + increment){
                System.out.println("Max Size: " + j);
                ArrayList<Integer> balances = new ArrayList<Integer>();
                for(int i = 0; i < trials; i++){      
            if( i%100 == 0){
                System.out.println("Trial: " + i);
            }

                        Casino c = CasinoFactory.makeCasino(gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt");
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

    public static void carveSpaces(int trials, int gamblers, int allowance, String wheelFile, String oddsFile, String value, int size){
       ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CARVE SPACES SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("GAMBLERS: " + gamblers);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println("VALUE TO CARVE: " + value);
        System.out.println("NEW SIZE OF VALUE: " + size);
        System.out.println(); 
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(gamblers, allowance, wheelFile, oddsFile);
            CasinoComponents.getInstance().getWheel().carve(value, size);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        //System.out.println(balances);
        double average = average(balances);
        System.out.println("Average balance for casino: " + average);
        System.out.println("Variance: " + variance(balances, average));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void oddsSuite(int trials, int gamblers, int allowance, String outputFile, String type, int maxOdd, int increment){
        try{
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING AN ODDS SUITE SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        FileWriter writer = new FileWriter(new File(outputFile));
        writer.write("trials = " + trials + " gamblers = " + gamblers + " allowance = " + allowance + "\n"); 
        writer.write("odd, average, variance\n");
        for(int j = 0; j <= maxOdd; j = j + increment){
                System.out.println("Max Odd: " + j);
                ArrayList<Integer> balances = new ArrayList<Integer>();
                for(int i = 0; i < trials; i++){      
            if( i%100 == 0){
                System.out.println("Trial: " + i);
            }

                        Casino c = CasinoFactory.makeCasino(gamblers, allowance, "config_wheel_1.txt", "config_odds_1.txt");
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

    public static void changeOdds(int trials, int gamblers, int allowance, String wheelFile, String oddsFile, String type, int odd){
        ArrayList<Integer> balances = new ArrayList<Integer>();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("YOU ARE RUNNING A CHANGE ODDS SIM");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("INPUT PARAMETERS");
        System.out.println("TRIALS: " + trials);
        System.out.println("GAMBLERS: " + gamblers);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("WHEEL FILE: " + wheelFile);
        System.out.println("ODDS FILE: " + oddsFile);
        System.out.println("ODD TYPE TO CHANGE: " + type);
        System.out.println("NEW ODD: " + odd);
        System.out.println(); 
        for(int i = 0; i < trials; i++){
            Casino c = CasinoFactory.makeCasino(gamblers, allowance, wheelFile, oddsFile);
            c.setOdds(type, odd);
            Result r = c.run();
            balances.add(r.getBalance());
        }
        System.out.println("Simulation over after " + trials + " trials.");
        //System.out.println(balances);
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
