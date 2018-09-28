/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naliligawwww;

/**
 *
 * @author student
 */
public class NALILIGAWWWW {

    /**
     * @param args the command line arguments
     */
     public static double power(double base, int exponent){
         if (exponent == 0) {
        return 1;
    }
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double s = power(2,4);
        System.out.println(s);
   
    }
    
}
