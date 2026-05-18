import java.util.*;
public class rotate_d {

    public static void rotate_by_d(int[] arr , int d) {
        int n = arr.length;
        d = d % n;
        // step 1
        int temp[] = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // step 2
        for(int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        // step 3 --> last and add temp elements
        int j = 0;
        for(int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
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
        rotate_by_d(arr , 3);
        for(int a : arr) {
            System.out.print(a+" ");
        }

        sc.close();
    }
}
