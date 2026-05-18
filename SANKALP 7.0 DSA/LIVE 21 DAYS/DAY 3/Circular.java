import java.util.Scanner;

public class Circular {

    // Helper method: Linear DP with O(1) Space Memory Optimization
    public static long maxLinear(int startVal, int endVal) {
        long prev2 = 0; // Represents the max sum 2 steps back
        long prev1 = 0; // Represents the max sum 1 step back
        
        // We use the loop counter 'val' directly instead of an array!
        for (int val = startVal; val <= endVal; val++) {
            // Pick max of: skipping current val (prev1), or taking current val + sum from 2 steps back (prev2)
            long curr = Math.max(prev1, prev2 + val);
            
            // Shift our pointers forward for the next iteration
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1; // prev1 holds the max sum at the end
    }

    // Method to handle the circular wrap-around logic
    public static long maxCircular(int n) {
        // Edge cases
        if (n <= 0) return 0;
        if (n == 1) return 1;

        // Pass 1: Exclude the first element (1), evaluate from 2 to n.
        long pass1 = maxLinear(2, n);
        
        // Pass 2: Exclude the last element (n), evaluate from 1 to n-1.
        long pass2 = maxLinear(1, n - 1);

        // Return the best result of the two valid non-circular possibilities
        return Math.max(pass1, pass2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Always check for input to avoid runtime exceptions in hidden test cases
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); // Size of the pattern
            int m = sc.nextInt(); // Number of repetitions
            
            long sumOnePattern = maxCircular(n);
            long finalAnswer = sumOnePattern * m;
            
            System.out.println(finalAnswer); 
        }
        
        sc.close();
    }
}