import java.util.*;
public class Sum {
    public static int array_sum(int[] arr){
        int ans = 0;
        for(int a : arr){
            ans += a;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        int ans = array_sum(arr);
        System.out.println(ans);

        sc.close();

    }
}