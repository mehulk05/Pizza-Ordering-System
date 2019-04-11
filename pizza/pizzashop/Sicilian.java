
package pizzashop;

import java.util.Scanner;


public class Sicilian extends Pizza {
    public static final int small_width = 10; 
    public static final int med_width = 12; 
    public static final int lg_width = 14; 
     public Sicilian() {
        
        this.type = "Sicilian";
    }
    public Sicilian(int size) {
        super(size);
        this.type = "Sicilian";
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
        while(numToppings > 2)
        {
            System.out.println("Sorry, you are limited to two. ");
            System.out.println("How many toppings would you like? ");
            numToppings = in.nextInt();
        }
        in.nextLine();
        for(int i = 0;i<numToppings;i++)
        {
            System.out.println("Enter topping: ");
            String topping = in.nextLine();
            toppings.add(topping);
            this.cost += 2.50;//an extra $2.50 for each topping
        }
    }
    
}
