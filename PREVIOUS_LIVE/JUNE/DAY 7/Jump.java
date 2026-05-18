import java.util.*;
public class Jump {
    public static boolean jump(int[] nums){
        int maxI = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > maxI) {
                return false;
            }
            maxI = Math.max(maxI , i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean ans = jump(nums);
        if(ans){
            System.out.println("it is possible to reach the last index.");
        } else {
            System.out.println("it is not possible to reach the last index.");
        }
        sc.close();
    }
}