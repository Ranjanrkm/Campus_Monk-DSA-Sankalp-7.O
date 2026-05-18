import java.util.*;
public class RotateK {

    public static void reverse(int[] arr, int l, int r){
  
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void rotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        int d = sc.nextInt();
        rotate(arr, d);

        for(int a : arr){
            System.out.print(a+" ");
        }

        sc.close();
    }
}