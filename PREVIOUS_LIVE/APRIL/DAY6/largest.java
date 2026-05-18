import java.util.*;
public class largest{
    public static int Largest(int[] nums) {
        int large = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > large) {
                large = nums[i];
            }
        }
        return large;
    }

    public static int Largest1(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = Largest(nums);
        System.out.println(ans);
        int ans1 = Largest1(nums);
        System.out.println(ans1);
        sc.close();
    }
}