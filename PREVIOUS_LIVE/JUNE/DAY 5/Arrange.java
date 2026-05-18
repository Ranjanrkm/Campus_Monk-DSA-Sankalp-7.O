import java.util.*;
public class Arrange {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i = 0; i < n/ 2; i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }

        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = rearrangeArray(arr);
        for(int num : ans) {
            System.out.print(num+" ");
        }
        sc.close();
    }
}