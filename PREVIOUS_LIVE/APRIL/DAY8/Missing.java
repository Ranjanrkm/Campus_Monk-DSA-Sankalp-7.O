import java.util.*;
public class Missing{

    public static int miss3(int[] nums , int n) {
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return n;
    }
    public static int miss2(int[] nums, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        for(int i = 0; i < n;i++) {
            xor2 ^= nums[i];
        }
        return xor1 ^ xor2;
    }
    public static int miss(int[] nums, int n) {
        int reqS = (n * (n + 1)) / 2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        return reqS - sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans1 = miss(nums , n);
        System.out.println(ans1);
        int ans2 = miss2(nums , n);
        System.out.println(ans2);
        int ans3 = miss3(nums , n);
        System.out.println(ans3);
        sc.close();
    }
}