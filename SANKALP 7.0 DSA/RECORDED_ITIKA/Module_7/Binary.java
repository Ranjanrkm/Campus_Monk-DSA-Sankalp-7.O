import java.util.Scanner;

public class Binary {

    // Method to check if we can reach the end of the array
    public static int search(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mini = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[mid]) {
                mini = Math.min(mini , arr[low]);
                low = mid + 1;
            } else {
                mini = Math.min(mini , arr[mid]);
                high = mid - 1;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = search(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}