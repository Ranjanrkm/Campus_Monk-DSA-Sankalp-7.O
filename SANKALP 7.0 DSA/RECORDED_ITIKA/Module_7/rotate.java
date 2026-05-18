import java.util.Scanner;

public class rotate {

    // Method to find how many times the array is rotated
    public static int findKRotation(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        
        int low = 0;
        int high = arr.length - 1;
        int mini = Integer.MAX_VALUE;
        int index = -1;
        
        while (low <= high) {
            // Optimization: If the current search space is fully sorted, 
            // the minimum must be at 'low'.
            if (arr[low] <= arr[high]) {
                if (mini > arr[low]) {
                    index = low;
                }
                break; // No need to search further!
            }
            
            int mid = low + (high - low) / 2;
            
            // If the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (mini > arr[low]) {
                    mini = arr[low];
                    index = low;
                }
                low = mid + 1; // Eliminate left half
            } 
            // If the right half is sorted
            else {
                if (mini > arr[mid]) {
                    mini = arr[mid];
                    index = mid;
                }
                high = mid - 1; // Eliminate right half
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int ans = findKRotation(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}