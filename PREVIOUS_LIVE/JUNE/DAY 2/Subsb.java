import java.util.*;
public class Subsb {
    public static int sub_array(int[] arr, int n, int k) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int ans = sub_array(arr, n, k);
        System.out.println(ans);


        sc.close();
    }
}