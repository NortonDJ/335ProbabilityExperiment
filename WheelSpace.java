
/**
 * Write a description of class WheelSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WheelSpace
{
    //The relative size of the cut for the space (for carving the wheel
    private int size; //default is 1
    
    //The numeric value like "00" or "0" or "1" etc
    private String value;
    
    //The color of the tile
    private String color;
    /**
     * Constructor for objects of class WheelSpace
     */
    public WheelSpace(String value, String color, int size)
    {
        this.size = size;
        this.value = value;
        this.color = color;
    }
    
    public boolean isOdd(){
        Integer valueInt = Integer.parseInt(this.value);
        if(valueInt > 0){
            return valueInt % 2 != 0;
        } else {
            return false; //green spaces 00, 0 etc are not odd
        }
    }
    
    public boolean isEven(){
        Integer valueInt = Integer.parseInt(this.value);
        if(valueInt > 0){
            return valueInt % 2 == 0;
        } else {
            return false; //green spaces 00, 0 etc are not even
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public String getValue(){
        return value;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean isBlack(){
        return this.color.equals("black");
    }
    
    public boolean isRed(){
        return this.color.equals("red");
    }

    public void setSize(int size){
	this.size = size;
    }
    
    public String toString(){
        String s ="(" + value + "," + color + "," + size + ")";
        return s;
    }
}
