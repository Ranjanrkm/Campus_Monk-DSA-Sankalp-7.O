import java.util.*;

public class  {
    
    // Optimized Two Sum using HashMap
    // Time Complexity: O(N), Space Complexity: O(N)
    public static int[] twoSum(int[] arr, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array exactly once
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            int requiredNum = target - currentNum;
            
            // If the required number to reach the target is already in our map, we found our pair!
            if (map.containsKey(requiredNum)) {
                // Return the index of the required number, and our current index
                return new int[] { map.get(requiredNum), i };
            }
            
            // Otherwise, add the current number and its index to the map for future checks
            map.put(currentNum, i);
        }
        
        // If no pair is found, return [-1, -1]
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner sc = new Scanner(System.in);
        
        // Check if input exists to prevent NoSuchElementException
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            // Reading array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Reading the target value
            int target = sc.nextInt();
            
            // Call the function and store the result
            int[] ans = twoSum(arr, target);
            
            // Print the result in the format expected by most judges
            System.out.println(ans[0] + " " + ans[1]);
        }
        
        sc.close();
    }
}