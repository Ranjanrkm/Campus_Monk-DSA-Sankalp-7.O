import java.util.*;
public class Twos {
    public static int[] sum(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j > i; j--) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
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

        if(ans[0] == -1) {
            System.out.println("two indices does not exist");
        } else {
            System.out.println("indices : "+ans[0] +" and " + ans[1]);
        }


        sc.close();
    }
}
