import java.util.*;

public class SingleBin {
    
    // Optimal O(log N) approach using Binary Search
    public static int findSingleNumber(int[] arr) {
        int n = arr.length;
        
        // Edge Cases: Prevent Out of Bounds errors
        if (n == 0) return -1;
        if (n == 1) return arr[0];
        
        // Check boundaries first so we don't have to check them inside the loop
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];
        
        // Binary search space starts strictly inside the boundaries
        int low = 1;
        int high = n - 2;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            
            // If mid element is different from both its neighbors, we found it!
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } 
            
            // Determine which half to discard based on the (Even, Odd) index pairing rule
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // The pattern is intact. The single element is further to the right.
                low = mid + 1;
            } else {
                // The pattern is broken. The single element is to the left.
                high = mid - 1;
            }
        }

        return -1; // Fallback if no such element exists
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println(-1);
                sc.close();
                return;
            }
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int ans = findSingleNumber(arr);
            System.out.println(ans);
        }
        
        sc.close();
    }
}