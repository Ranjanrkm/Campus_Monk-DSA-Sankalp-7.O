import java.util.*;
public class LeftOne {

    public static void left(int[] arr){
        int n = arr.length;

        int temp = arr[0];

        for(int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        left(arr);

        for(int a : arr){
            System.out.print(a+" ");
        }

        sc.close();
    }
}