import java.util.*;
import java.io.*;

public class Stock {
    
    // Method to calculate the maximum profit
    public static int BuySell(int[] arr) {
        // If the array is empty or has only 1 element, no transaction can happen
        if (arr == null || arr.length < 2) {
            return 0; 
        }

        int n = arr.length;
        int mini = arr[0]; // Track the minimum price seen so far
        int maxiP = 0;     // Track the maximum profit found so far

        for (int i = 0; i < n; i++) {
            // Calculate potential profit if we sold on the current day 'i'
            int currentProfit = arr[i] - mini;
            
            // Update the maximum profit if the current profit is higher
            maxiP = Math.max(maxiP, currentProfit);
            
            // Update the minimum price if the current day's price is lower
            mini = Math.min(mini, arr[i]);
        }
        
        return maxiP;
    }

    // Main method must throw Exception when using BufferedReader
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the size of the array
        int n = Integer.parseInt(br.readLine().trim()); 
        
        // Read the array elements as a single space-separated string
        String[] input = br.readLine().trim().split(" ");
        
        int[] arr = new int[n];
        
        // Convert string array to integer array
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Call the function and print the result
        int ans = BuySell(arr);
        System.out.println(ans);
    }
}