import java.util.*;
public class Kadans {

    public static int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
       int start = 0;
       int ansStart = -1, ansEnd = -1;
       for(int i = 0; i < nums.length; i++) {
        if(sum == 0) {
            start = i;
        }
        sum += nums[i];
        if(sum > maxi) {
            maxi = sum;
            ansStart = start;
            ansEnd = i;
        }
        if(sum < 0) {
            sum = 0;
        }
       }
       System.out.print("The subarray is : [");
       for(int i = ansStart; i <= ansEnd; i++) {
        System.out.print(nums[i]+" ");
       }
       System.out.println("]");
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
