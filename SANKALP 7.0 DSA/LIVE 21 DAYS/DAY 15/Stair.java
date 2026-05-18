import java.util.Scanner;

public class Stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        
        System.out.println(countWays(n));
        sc.close();
    }

    public static int countWays(int n) {
        // Base cases for 1 or 2 steps
        if (n <= 2) return n;
        
        int prev2 = 1; // Ways for n=1
        int prev1 = 2; // Ways for n=2
        
        // Iteratively calculate ways for each subsequent step
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}