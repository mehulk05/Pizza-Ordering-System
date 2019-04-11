
package pizzashop;
import java.util.*;

/**
 *
 * @author Peggy Fisher
 */
public class Regular extends Pizza{

    public Regular()
    {
        
    }
    public Regular(int size) {
        super(size);
        this.type = "Regular";
    }
    public double getCost()
    {
        return this.cost;
    }

    /**
     *  Updates the Toppings arraylist
     */
    @Override
    public void getToppings()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many toppings would you like?");
        int numToppings = in.nextInt();
         while(numToppings > 4)
        {
            System.out.println("Sorry, you are limited to four. ");
            System.out.println("How many toppings would you like? ");
            numToppings = in.nextInt();
        }
         in.nextLine();
        for(int i = 0;i<numToppings;i++)
        {
            System.out.println("Enter topping: ");
            String topping = in.nextLine();
            toppings.add(topping);
            this.cost += 2.00;
        }
    }

    
   
    
}
