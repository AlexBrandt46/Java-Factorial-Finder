package factorialfinder;

import java.util.Scanner;

public class FactorialFinder {
    public static void main (String[] args) {
        
        int initialValue;
        int finalValue = 1;
        Scanner in = new Scanner(System.in);
        
        //gets input from the user as to what number they'd like to perform a factorial on
        System.out.println ("What would you like to perform a factorial on?");
            initialValue = in.nextInt();
            
        for (int i = initialValue; i >= 1; i--) {
            finalValue *= i;
        }
        System.out.println ("The final value of " + initialValue + "when you perform a factorial on it is: " + finalValue);
    }
}


/*this is the solution because if i is assigned the same value as initialValue
and you decrement it after each time it'll multiply whatever the finalValue is by i
and then assign the new value to finalValue, and if finalValue is initially assigned the value of 
1 then it'll multiply itself by i
*/
