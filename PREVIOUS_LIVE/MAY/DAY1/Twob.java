
import java.util.*;
public class Twob {
    public static boolean sum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int l = 0; 
        int r = n - 1;
        while(l < r) {
            if(arr[l] + arr[r] == target) {
                return true;
            } else if(arr[l] + arr[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean ans = sum(arr , target);

        System.out.println(ans);

        sc.close();
    }
}
