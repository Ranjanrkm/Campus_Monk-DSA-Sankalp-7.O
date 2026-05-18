import java.util.*;
public class recarray {

    public static void swap(int[] arr , int l , int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }

    public static void revarray(int[] arr , int l , int r) {
        if(l > r) return;
        swap(arr , l , r);
        revarray(arr , l + 1 , r - 1);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter Elements of array :");
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        revarray(arr , 0 , n-1);
        System.out.print("The reversed array is : ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}