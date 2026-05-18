import java.util.*;
public class Maxs{
    public static int pointsM(int[] arr , int k) {
        int n = arr.length;
        int ssum = 0;
        for(int i = 0; i < k; i++) {
            ssum += arr[i];
        }
        int esum = 0;
        for(int j = n - 1; j >= n - k; j-- ){
            esum += arr[j];
        }

        return Math.max(ssum , esum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int ans = pointsM(arr , k);
        System.out.println(ans);
        sc.close();
    }
}