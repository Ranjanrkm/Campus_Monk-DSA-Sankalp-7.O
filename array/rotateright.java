import java.util.*;
public class rotateright {
    public static void reverse(int[] arr , int l , int r){
        while(l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void rightRotate(int[] arr, int n , int k){
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter elements of the array : ");
            int temp = sc.nextInt();
            arr[i] = temp;

        }

        System.out.print("how many elements you want to rotate in right : ");
        int k = sc.nextInt();
        rightRotate(arr , n , k);
         System.out.print("the array after right rotation by "+k+" elements is this : ");
        for(int a : arr) {
            System.out.print(a+" ");
        }
        sc.close();
    }
}