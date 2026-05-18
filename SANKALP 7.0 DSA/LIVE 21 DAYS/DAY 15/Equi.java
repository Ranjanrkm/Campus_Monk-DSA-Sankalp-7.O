import java.util.Scanner;

public class Equi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            totalSum += nums[i];
        }
        
        int result = findEquilibrium(nums, totalSum);
        System.out.println(result);
        
        sc.close();
    }
    
    public static int findEquilibrium(int[] nums, long totalSum) {
        long leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // rightSum = total - left - current
            long rightSum = totalSum - leftSum - nums[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}