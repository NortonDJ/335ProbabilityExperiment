import java.util.*;
import java.io.*;
/**
 * Write a description of class RouletteFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RouletteFactory
{
    public RouletteFactory()
    {
    }

    public static Wheel makeWheel(String configFile){
        try{
            ArrayList<WheelSpace> spaces = new ArrayList<WheelSpace>();
            Scanner in = new Scanner(new File(configFile));
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                Scanner threeWords = new Scanner(line);
                String value = threeWords.next();
                String color = threeWords.next();
                int size = Integer.parseInt(threeWords.next());
                spaces.add(new WheelSpace(value, color, size));
            }
            return new Wheel(spaces);
        } catch (Exception e){
            System.out.println("Error parsing wheel config file. Exiting.");
            e.printStackTrace();
            System.exit(-1);
        }
        return null;

        /*
        Element zero = new Element(0, "green", "neither");//00
        table.add(zero);
        Element zerozero = new Element(-1, "green", "neither");//000
        table.add(zerozero);
        //maybe randomly coloring???
        for(int i = 0; i < size; i = i+2){
        Element element1 = new Element(i+1,"red","odd");
        Element element2 = new Element(i+2,"black","even");
        table.add(element1);
        table.add(element2);
        }
        return table;*/
    }
}
