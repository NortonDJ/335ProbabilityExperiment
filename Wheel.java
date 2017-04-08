import java.util.*;
/**
 * Write a description of class Wheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wheel
{
    /**
     * Constructor for objects of class Wheel
     */
    public Wheel()
    {
        
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
}
