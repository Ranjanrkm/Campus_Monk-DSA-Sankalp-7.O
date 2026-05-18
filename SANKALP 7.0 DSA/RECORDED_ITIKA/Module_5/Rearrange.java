import java.util.*;

public class Rearrange {
    
    // Optimal Approach: Two Pointers (Single Pass)
    // Time Complexity: O(N), Space Complexity: O(N)
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        // Create an array to store our final rearranged elements
        int[] ans = new int[n];
        
        // Pointers for the next available positive and negative slots
        int posIndex = 0; 
        int negIndex = 1;
        
        // Iterate through the original array exactly once
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // Place the positive number at the current positive index
                ans[posIndex] = arr[i];
                // Move the positive pointer to the next valid even index (jump by 2)
                posIndex += 2;
            } else {
                // Place the negative number at the current negative index
                ans[negIndex] = arr[i];
                // Move the negative pointer to the next valid odd index (jump by 2)
                negIndex += 2;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Get the newly rearranged array
            int[] rearrangedArray = rearrange(arr);
            
            // Print out the result
            for (int i = 0; i < n; i++) {
                System.out.print(rearrangedArray[i] + " ");
            }
        }
        
        sc.close();
    }
}