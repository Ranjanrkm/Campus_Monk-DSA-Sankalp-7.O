import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        // Initialize Scanner for standard input
        Scanner sc = new Scanner(System.in);
        
        // Read input only if available
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println(numberOfSubstrings(s));
        }
        
        sc.close();
    }

    public static int numberOfSubstrings(String s) {
        // Variables to store the last seen index of 'a', 'b', and 'c'
        int lastA = -1, lastB = -1, lastC = -1;
        int count = 0;
        
        // Iterate through the string character by character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Update the last seen index for the current character
            if (ch == 'a') lastA = i;
            else if (ch == 'b') lastB = i;
            else if (ch == 'c') lastC = i;
            
            // Find the minimum index among the three characters
            // If any character hasn't been seen, this will be -1
            int minIndex = Math.min(lastA, Math.min(lastB, lastC));
            
            // Add the number of valid substrings ending at current index 'i'
            // minIndex + 1 gives the exact count of starting points
            count += (minIndex + 1);
        }
        
        return count; 
    }
}