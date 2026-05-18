import java.util.*;
public class rotate {

    public static void left_rotate_one(int[] arr) {
        int n = arr.length;
        // step 1
        int temp = arr[0];
        // step 2
        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        // step 3
        arr[n - 1] = temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the input array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        left_rotate_one(arr);
        for(int a : arr) {
            System.out.print(a+" ");
        }

        sc.close();
    }
}