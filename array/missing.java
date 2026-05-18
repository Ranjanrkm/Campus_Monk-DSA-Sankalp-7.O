import java.util.*;
public class missing {
    public static int missing_num(int[] arr) {
        // elements
        int n = arr.length + 1;

        // 6 + 1 -> 7
        for(int i = 1; i <= n; i++) {
            boolean flag = false;
            for(int j = 0; j < arr.length; j++) {
                if(i == arr[j]) {
                    flag = true;
                }
            }
            if(flag == false) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int ans = missing_num(arr);
       System.out.print(ans);
        sc.close();
    }
}
