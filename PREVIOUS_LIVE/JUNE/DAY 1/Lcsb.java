import java.util.Scanner;
public class Lcsb {
    static boolean linear(int[] arr, int n, int ele) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == ele) {
                return true;
            }
        }
        return false;
    }

    static int longestConsSeries(int[] arr, int n) {
        int longest = 1;
        for(int i = 0; i < n; i++) {
            int cnt = 1;
            int x = arr[i];
            while(linear(arr , n , x + 1)) {
                cnt++;
                x++;
            }
            longest = Math.max(longest , cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = longestConsSeries(arr , n);
        System.out.println(ans);
    }
}