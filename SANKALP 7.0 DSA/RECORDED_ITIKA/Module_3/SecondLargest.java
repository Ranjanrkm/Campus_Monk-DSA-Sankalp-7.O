import java.util.*;
public class SecondLargest {

    public static int second_largest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int sec_large = -1;
        for(int i = n - 2; i >= 0; i--){
            if(largest != arr[i]){
                sec_large = arr[i];
                break;
            }
        }
        return sec_large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = second_largest(arr);
        System.out.println(ans);
        sc.close();
    }
}