import java.util.*;
public class sndlargest{

    public static int sle(int[] nums , int n) {
        if(n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondl = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            largest = Math.max(largest , nums[i]);
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > secondl && nums[i] != largest) {
                secondl = nums[i];
            }
        }
        return (secondl == Integer.MIN_VALUE) ? -1 : secondl;
    }
    public static int Slargest(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[nums.length - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = Slargest(nums);
        System.out.println(ans);

        int ans1 = sle(nums , n);
        System.out.println(ans1+" ");
        sc.close();
    }
}