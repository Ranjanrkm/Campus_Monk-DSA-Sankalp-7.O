
import java.util.*;
public class Twoh {
    public static int[] sum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int need = target - arr[i];
            if(mp.containsKey(need)) {
                return new int[] {mp.get(need), i};
            }
            mp.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = sum(arr , target);

        System.out.println(ans[0]+ " " +ans[1]);


        sc.close();
    }
}
