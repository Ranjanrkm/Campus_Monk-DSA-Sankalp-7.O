import java.util.*;
public class Linear{
    public static int Search(int k , int[] nums){
     for(int i = 0; i < nums.length; i++){
        if(nums[i] == k) {
            return i;
        }
     }
     return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = Search(k , nums);
        System.out.println(ans);
        sc.close();
    }
}