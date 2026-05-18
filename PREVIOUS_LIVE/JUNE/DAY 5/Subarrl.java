import java.util.*;
public class Subarrl {

    public static int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            long sum = 0;
            for(int j = i; j < nums.length; j++){
            sum += nums[j];
            if(sum > maxi) {
                maxi = sum;
            }
            }
        }
        return (int) maxi;
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