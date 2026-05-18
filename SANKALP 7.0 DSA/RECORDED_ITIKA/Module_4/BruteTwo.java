import java.util.*;
public class BruteTwo {
    public static int[] twosum(int arr[] , int target) {
        int[] ans = new int[2];
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j; 
                    return ans;
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        int[] ans = twosum(arr, target);
        System.out.print(ans[0]+" "+ans[1]);
        sc.close();
    }
}
