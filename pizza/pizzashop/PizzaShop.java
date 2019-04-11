/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class PizzaShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = in.nextLine();
        System.out.println("What type of pizza would you like, regular or "
                + "sicilian? ");
        String type = in.nextLine();
        //Pizza pizza1 = new Regular();
        if(type.equalsIgnoreCase("regular"))
        {
            System.out.println("What size? S, M, L, X?");
            String size = in.nextLine();
            Regular pizza1 = new Regular();
            if(size.equalsIgnoreCase("S"))
            {
                pizza1 = new Regular(12);
            }
            else if(size.equalsIgnoreCase("M"))
            {
                pizza1 = new Regular(14);
            }
            else if(size.equalsIgnoreCase("L"))
            {
                pizza1 = new Regular(16);
            }
            else if(size.equalsIgnoreCase("X"))
            {
                pizza1 = new Regular(18);
            }
            pizza1.getToppings();
            pizza1.printSring();
        }
        else
        {
            System.out.println("What size? S, M, L?");
            String size = in.nextLine();
            Sicilian pizza1 = new Sicilian();
            if(size.equalsIgnoreCase("S"))
            {
                pizza1 = new Sicilian(10);
            }
            else if(size.equalsIgnoreCase("M"))
            {
                pizza1 = new Sicilian(12);
            }
            else if(size.equalsIgnoreCase("L"))
            {
                pizza1 = new Sicilian(14);
            }
            pizza1.getToppings();
            pizza1.printSring();
        }
        }
    
}
