import java.util.*;
public class LeftK {

    public static void rotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        int[] temp = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        int j = 0;
        for(int i = n - d; i < n; i++){
            arr[i] = temp[j];
            j++;
        }

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