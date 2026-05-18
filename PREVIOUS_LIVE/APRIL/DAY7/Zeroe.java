import java.util.*;
public class Zeroe {
    public static void End(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        End(arr);

        for(int a : arr){
            System.out.print(a+" ");
        }

        sc.close();
    }
}