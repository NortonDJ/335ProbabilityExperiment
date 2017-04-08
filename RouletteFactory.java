import java.util.*;
/**
 * Write a description of class RouletteFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RouletteFactory
{
    int size;
    ArrayList<Element> table = new ArrayList<Element>();
    public RouletteFactory(int size)
    {
        this.size = size;
        this.construct();
    }
    
    public ArrayList construct(){
        Element zero = new Element(0, "green", "neither");
        table.add(zero);
        Element zerozero = new Element(-1, "green", "neither");
        table.add(zerozero);
        //maybe randomly coloring???
        for(int i = 0; i < size; i = i+2){
            Element element1 = new Element(i+1,"red","odd");
            Element element2 = new Element(i+2,"black","even");
            table.add(element1);
            table.add(element2);
        }
        return table;
    }
    
    public int number_of_elements(){
        return table.size();
    }
}
