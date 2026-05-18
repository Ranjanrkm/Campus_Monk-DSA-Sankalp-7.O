import java.util.Scanner;

public class DuthchAlgo {

    // Helper method to swap two elements in an array
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Method to sort the array using the Dutch National Flag algorithm
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // Initialize the three pointers
        int low = 0;
        int mid = 0;
        int high = n - 1;

        // Traverse the array until mid pointer crosses the high pointer
        while (mid <= high) {
            if (arr[mid] == 0) {
                // If the element is 0, swap it to the 'low' boundary
                swap(arr, mid, low);
                mid++; // Move mid forward
                low++; // Move the 0s boundary forward
            } 
            else if (arr[mid] == 1) {
                // If the element is 1, it's already in the correct middle section
                mid++; 
            } 
            else if (arr[mid] == 2) {
                // If the element is 2, swap it to the 'high' boundary
                swap(arr, mid, high);
                high--; // Expand the 2s boundary downward
                // Note: We DO NOT increment 'mid' here because the element 
                // swapped from 'high' needs to be evaluated in the next iteration.
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TCS Edge Case: Check if input exists
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // Edge Case: Handle invalid array sizes safely
            if (n <= 0) {
                sc.close();
                return; 
            }

            int[] arr = new int[n];

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Call the sorting logic
            sort(arr);

            // Print the array efficiently
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // Always close the scanner
        sc.close();
    }
}