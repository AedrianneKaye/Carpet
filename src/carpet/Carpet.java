/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpet;

/**
 *
 * @author aemal4075
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double l = 8.5; 
        double w = 6;
        double pm = 19.95; 
        double price = 0.0; 
        // algorithm of carpet
        price = l*w*pm;
        System.out.println("The price of the carpet is $" + price);
    }
    
}
