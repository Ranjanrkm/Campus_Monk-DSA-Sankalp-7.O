import java.util.HashMap;
import java.util.Scanner;

public class SumPos {

    // Optimized function using Prefix Sum and HashMap
    public static int getLongestSubarray(int[] arr, int k) {
        int n = arr.length;
        int l=0,r=0;
        int sum = arr[0];
        int maxlen = 0;
        while(r < n) {
            while(l <= r && sum > k) {
                sum -= arr[l];
                l++;
            }
            if(sum == k) {
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
            if(r < n) {
                sum += arr[r];
            }
        }

        return maxlen;
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