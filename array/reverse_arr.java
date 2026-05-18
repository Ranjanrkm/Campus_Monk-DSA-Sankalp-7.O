import java.util.*;
public class reverse_arr {

    public static void reverse(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l < r) {
            int  temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;

        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        reverse(arr);
        for(int a : arr) {
            System.out.print(a+" ");
        }

        sc.close();
    }
}