import java.util.Scanner;

public class Search {

    // Method to check if we can reach the end of the array
    public static int search(int[] arr, int t) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == t) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if(arr[low] <= mid && t <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(arr[mid] <= t && t <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int t = sc.nextInt();
            int ans = search(arr, t);
            System.out.println(ans);
        }
        sc.close();
    }
}