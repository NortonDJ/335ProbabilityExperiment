/**
 * Write a description of class Element here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Element
{
    int number;
    String color;
    String odevity;
    /**
     * Constructor for objects of class Element
     */
    public Element(int number, String color, String odevity)
    {
        this.number = number;
        this.color = color;
        this.odevity = odevity;
    }
    
    public int get_number(){
        return number;
    }
    
    public String get_color(){
        return color;
    }
    
    public String get_odevity(){
        return odevity;
    }
}
