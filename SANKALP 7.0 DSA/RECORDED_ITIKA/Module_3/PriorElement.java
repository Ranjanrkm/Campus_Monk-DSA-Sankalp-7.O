import java.util.*;
public class PriorElement {
    public static int prior(int[] arr) {
        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(maxi < arr[i]) {
                maxi = arr[i];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // sc.nextLine();
        }
        int ans = prior(arr);
        System.out.println(ans);
        sc.close();
    }
}