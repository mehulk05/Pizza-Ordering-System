
package pizzashop;
import java.util.*;
/**
 *
 * @author Peggy Fisher
 */
public abstract class Pizza implements Comparable{
    public static final int small_diameter = 12; 
    public static final int med_diameter = 14; 
    public static final int lg_diameter = 16; 
    public static final int xlg_diameter = 18; 
    public double[] price = {10.00, 12.00, 14.00, 16.00};
    public double cost;
    public String type;
    public ArrayList<String> toppings = new ArrayList<String>();
    int size;
    public Pizza()
    {
        type = "pizza";
    }
    public Pizza(int size)
    {
        switch(size)
        {
            case small_diameter:
                cost = price[0];size = small_diameter; break;
            case med_diameter:
                cost = price[1];size = med_diameter;break;
            case lg_diameter:
                cost = price[2];size = lg_diameter;break;
            case xlg_diameter:
                cost = price[3];size = xlg_diameter;break;
            default:
                System.out.println("Invalid size");
                break;                
        }
    }
  
    public abstract void getToppings();
 @Override
    public int compareTo(Object t) {
        Pizza other = (Pizza)t;
        if(this.size < other.size)
            return -1;
        else if (this.size == other.size)
            return 0;
        else 
            return 1;
    }
     public void printSring()
    {
        String topping="";
        if(toppings.size()==0)
            topping = "no toppings selected.";
        else
        {
            for(int i = 0; i<toppings.size();i++)
            {
                topping += toppings.get(i) + ", ";
            }
        }
        System.out.println("Your pizza has been ordered with: " + topping +
                " and \nThe total cost is: $"+cost);
    }
    
    
}
