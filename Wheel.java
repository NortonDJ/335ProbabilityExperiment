import java.util.*;
/**
 * Write a description of class Wheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wheel
{
    private ArrayList<WheelSpace> spaces;
    
    /**
     * Constructor for objects of class Wheel
     */
    public Wheel(ArrayList<WheelSpace> spaces)
    {
        this.spaces = spaces;
    }

    /**
     * generate random integers in a specific range
     * 
     * int aStart, int aEnd, Random aRandom
     * @return randomNumber
     */
    public int randomPick(int aStart, int aEnd, Random aRandom){
        if(aStart > aEnd){
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber =  (int)(fraction + aStart);
        return randomNumber;
    }   
    
    public WheelSpace spin(){
        int totalSize = 0;
        for(WheelSpace s : spaces){
            totalSize += s.getSize();
        }
        int slot = randomPick(0, totalSize, new Random());
        int cumulativeSize = 0;
        for(WheelSpace s : spaces){
            cumulativeSize += s.getSize();
            if(slot <= cumulativeSize){
                return s;
            }
        }
        return null;
    }
    
    public String toString(){
        String s = "Roulette: ";
        for(WheelSpace space : spaces){
            s+= space + " ";
        }
        return s;
    }
}
