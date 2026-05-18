import java.util.*;
public class Ones{
    public static int Cone(int[] nums, int n) {
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1){
                cnt++;
                maxi = Math.max(maxi , cnt);
            } else {
                cnt = 0;
            }
            
        }
        return maxi;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = Cone(nums , n);
        System.out.println(ans);
        sc.close();
    }
}