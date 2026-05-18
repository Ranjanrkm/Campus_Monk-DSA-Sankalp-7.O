import java.util.*;
public class Card {

    public static int maxCard(int[] arr, int k){
        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        for(int i = 0; i < k; i++) {
            lsum += arr[i];
        }

        int left = k - 1;
        int right = n - 1;
        int maxi = lsum + rsum;
        while(left >= 0) {
            lsum -= arr[left];
            rsum += arr[right];
            maxi = Math.max(maxi, lsum + rsum);
            left--;
            right--;
        }

        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = maxCard(arr , k);
        System.out.println(ans);
    }
}