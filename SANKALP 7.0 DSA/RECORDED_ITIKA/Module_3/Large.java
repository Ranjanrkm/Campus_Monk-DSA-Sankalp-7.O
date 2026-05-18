import java.util.*;
public class Large {

    public static int largest(int[] arr){
        int n = arr.length;
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
      

        int ans = largest(arr);
        System.out.println(ans);
        sc.close();
    }
}