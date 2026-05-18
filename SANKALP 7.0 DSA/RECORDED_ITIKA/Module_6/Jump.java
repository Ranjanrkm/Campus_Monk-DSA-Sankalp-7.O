import java.util.Scanner;

public class Jump {

    // Method to check if we can reach the end of the array
    public static boolean canJump(int[] arr) {
        int n = arr.length;
        
        // maxReach keeps track of the furthest index we can reach so far
        int maxReach = 0; 
        
        for (int i = 0; i < n; i++) {
            // If our current index is greater than the maximum index we can reach,
            // it means we are stuck and cannot move forward.
            if (i > maxReach) {
                return false; 
            }
            
            // Update the maximum reachable index
            // Math.max compares the current maxReach with the reach from this new position (i + arr[i])
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Optimization: If maxReach is already at or beyond the last index, we can stop checking
            if (maxReach >= n - 1) {
                return true;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Always good practice to check if input exists in competitive programming
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // Handle edge case where array is empty
            if (n <= 0) {
                System.out.println("Not possible");
                return;
            }

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Call the function and print the result based on the boolean return
            if (canJump(arr)) {
                System.out.println("possible");
            } else {
                System.out.println("Not possible");
            }
        }
        sc.close();
    }
}