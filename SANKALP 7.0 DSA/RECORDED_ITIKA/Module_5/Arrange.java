import java.util.*;

public class Arrange {
    
    // ArrayList Approach
    // Time Complexity: O(N), Space Complexity: O(N)
    public static void rearrangeWithList(int[] arr) {
        int n = arr.length;
        
        // Step 1: Create two separate ArrayLists for positive and negative numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Step 2: Traverse the array and separate the elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        
        // Step 3: Put them back into the original array in alternating order
        // Since we know positives and negatives are equal, we loop up to n/2
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);         // Even indices get positive numbers
            arr[2 * i + 1] = neg.get(i);     // Odd indices get negative numbers
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Call the function to modify the array in-place
            rearrangeWithList(arr);
            
            // Print out the result
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}