import java.util.*;
public class Lrk {
    public static void reverse(int[] arr, int start , int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotatearr(int[] arr, int n, int k) {
        k = k % n;
        reverse(arr , 0 , k - 1);
        reverse(arr , k , n - 1);
        reverse(arr , 0 , n - 1);
    }
    public static void rotate(int[] arr, int n, int k){
        k = k % n;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        for(int i = k; i < n; i++){
            arr[i - k] = arr[i];
        }

        for(int i = 0; i < k; i++){
            arr[n - k + i] = temp[i];
        }
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(arr, n , k);

        for(int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        rotatearr(arr , n , k);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}