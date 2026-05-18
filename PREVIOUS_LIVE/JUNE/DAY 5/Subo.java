
import java.util.*;
public class Subo {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += nums[j];
                if(maxi <sum) {
                    maxi = sum;
                }
            }   
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = maxSubArray(arr);
        System.out.println("The maximum subarray sum is: "+maxSum);
        sc.close();
    }
}

