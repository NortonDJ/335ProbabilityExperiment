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
    private ArrayList<WheelSpace> line1;
    private ArrayList<WheelSpace> line2;
    private ArrayList<WheelSpace> line3;
    private ArrayList<WheelSpace> firstHalf;
    private ArrayList<WheelSpace> secondHalf;
    private ArrayList<WheelSpace> firstThird;
    private ArrayList<WheelSpace> secondThird;
    private ArrayList<WheelSpace> thirdThird;

    /**
     * Constructor for objects of class Wheel
     */
    public Wheel(ArrayList<WheelSpace> spaces)
    {
        this.spaces = spaces;
        fillGroupings();
    }

    public void addGreenSpaces(int numberOfSpaces, int size){
	for(int i = 0; i < numberOfSpaces; i++){
	    String s = "";            
	    for(int j = 0; j < i + 2; j++){
		s += "0";	
	    }
	    this.spaces.add(new WheelSpace(s, "g", size));
	}
    }

    public void carve(String value, int size){
	for(WheelSpace space : spaces){
	    if(space.getValue().equals(value)){
	        space.setSize(size);
		return;
	    }        
	}
    }
    public void fillGroupings(){
        line1 = new ArrayList<WheelSpace>();
        line2 = new ArrayList<WheelSpace>();
        line3 = new ArrayList<WheelSpace>();
        firstHalf = new ArrayList<WheelSpace>();
        secondHalf = new ArrayList<WheelSpace>();
        firstThird = new ArrayList<WheelSpace>();
        secondThird = new ArrayList<WheelSpace>();
        thirdThird = new ArrayList<WheelSpace>();
        for(int i = 0; i < 12; i++){
	    int index = i * 3;
            line1.add(getSpace("" + (index+1)));
            line2.add(getSpace("" + (index+2)));
            line3.add(getSpace("" + (index+3)));
        }
        for(int i = 1; i < 19; i++){
            firstHalf.add(getSpace("" + i));
            secondHalf.add(getSpace("" + (18+i)));
        }
        for(int i = 1; i < 13; i++){
            firstThird.add(getSpace("" + i));
            secondThird.add(getSpace("" + (i+12)));
            thirdThird.add(getSpace("" + (i+24)));
        }
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
    
    public WheelSpace randomlySelectSpace(){
        int index = randomPick(0, spaces.size()-1, new Random());
        return spaces.get(index);
    }

    public WheelSpace getSpace(String value){
        for(WheelSpace s : spaces){
            if(s.getValue().equals(value)){
                return s;
            }
        }
        return null;
    }

    public ArrayList<WheelSpace> getLine1(){
        return line1;
    }

    public ArrayList<WheelSpace> getLine2(){
        return line1;
    }

    public ArrayList<WheelSpace> getLine3(){
        return line1;
    }

    public ArrayList<WheelSpace> getFirstHalf(){
        return firstHalf;
    }

    public ArrayList<WheelSpace> getSecondHalf(){
        return secondHalf;
    }

    public ArrayList<WheelSpace> getFirstThird(){
        return firstThird;
    }

    public ArrayList<WheelSpace> getSecondThird(){
        return secondThird;
    }

    public ArrayList<WheelSpace> getThirdThird(){
        return thirdThird;
    }

    public String toString(){
        String s = "Roulette: ";
        for(WheelSpace space : spaces){
            s+= space + " ";
        }
        return s;
    }

    public int size(){
        return spaces.size();
    }
}
