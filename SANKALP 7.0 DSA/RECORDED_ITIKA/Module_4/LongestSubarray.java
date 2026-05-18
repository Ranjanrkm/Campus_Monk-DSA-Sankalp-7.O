import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarray {

    // Optimized function using Prefix Sum and HashMap
    public static int getLongestSubarray(int[] arr, int k) {
        int n = arr.length;
        
        // Map to store the prefix sums and their earliest occurrence index
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            // Calculate prefix sum till current index
            sum += arr[i];

            // Case 1: If the sum from the 0th index itself is exactly 'k'
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: Check if (sum - k) exists in the map
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                // Calculate length of the subarray
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Only store the prefix sum if it is not already present
            // This ensures we keep the leftmost index, maximizing the length
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reading the target sum
        int k = sc.nextInt();
        
        // Fetching and printing the result
        int len = getLongestSubarray(arr, k);
        System.out.println(len);
        
        sc.close();
    }
}