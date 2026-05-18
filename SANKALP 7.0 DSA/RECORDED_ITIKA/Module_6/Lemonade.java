import java.util.Scanner;

public class Lemonade {

    // Method is static so it can be called directly from static main
    public static boolean change(int[] bills) {
        // Variables to keep track of how many $5 and $10 bills we have
        int five = 0;
        int ten = 0;
        
        for (int bill : bills) {
            if (bill == 5) {
                // No change needed, just take the $5
                five++;
            } 
            else if (bill == 10) {
                // Need to give $5 in change
                if (five > 0) {
                    five--; // Give $5 back
                    ten++;  // Keep the $10
                } else {
                    return false; // Can't make change
                }
            } 
            else { // The bill is $20
                // Greedy Approach: Prefer giving one $10 and one $5 as change.
                // We save our $5 bills because they are more versatile!
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } 
                // If we don't have a $10, we must use three $5 bills
                else if (five >= 3) {
                    five -= 3;
                } 
                // We don't have the right combination for change
                else {
                    return false; 
                }
            }
        }
        
        // If we make it through the whole loop, we successfully served everyone
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Always good to check for input in TCS to avoid NoSuchElementException
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] bills = new int[n];
            
            for (int i = 0; i < n; i++) {
                bills[i] = sc.nextInt();
            }

            boolean ans = change(bills);

            if (ans) {
                System.out.println("possible");
            } else {
                System.out.println("not possible");
            }
        }
        sc.close();
    }
}