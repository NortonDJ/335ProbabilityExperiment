import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
/**
 * Write a description of class OddsFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OddsFactory
{
    public static HashMap<String, Integer> makeOdds(String oddsFile){
        try{
            HashMap<String, Integer> odds = new HashMap<String, Integer>();
            Scanner in = new Scanner(new File(oddsFile));
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                Scanner twoWords = new Scanner(line);
                String type = twoWords.next();
                int multiplier = Integer.parseInt(twoWords.next());
                odds.put(type, multiplier);
            }
            return odds;
        } catch (Exception e){
            System.out.println("Error reading odds file");
            System.exit(-1);
        }
        return null;
    }
}
