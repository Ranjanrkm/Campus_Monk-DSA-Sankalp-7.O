import java.util.*;
public class Leaderb {

    public static List<Integer> leaders(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            boolean leader = true;
            for(int j = i + 1; j < n; j++) {
                if(nums[j] >= nums[i]) {
                    leader = false;
                    break;
                }
            }
            if(leader) {
                ans.add(nums[i]);
            }
        }
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