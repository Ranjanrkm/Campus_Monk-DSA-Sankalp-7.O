import java.util.*;
public class Leadero {

    public static List<Integer> leaders(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();
        int max = nums[n - 1];
        ans.add(nums[n - 1]);
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = leaders(arr , n);
        for(int it : ans) {
            System.out.print(it+" ");
        }
        sc.close();
    }
}