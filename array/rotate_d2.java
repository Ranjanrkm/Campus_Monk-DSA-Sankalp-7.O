import java.util.*;
public class rotate_d2{

    public static void reverse(int[] arr , int l , int r) {
     
        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }

    public static void rotate_by_d(int[] arr , int n , int d) {
        reverse(arr , 0 , d-1);
        reverse(arr , d , n-1);
        reverse(arr , 0 , n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        rotate_by_d(arr , n , d);
        for(int a : arr) {
            System.out.print(a+" ");
        }
        


        sc.close();
    }
}