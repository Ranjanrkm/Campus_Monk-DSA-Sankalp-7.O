import java.util.*;
public class Ones {

    public static int freq(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        int maxi = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = freq(arr);
        System.out.println(ans);
        sc.close();
    }
}
