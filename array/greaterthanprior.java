import java.util.*;
public class greaterthanprior {

    public static int greaterthanprevious(int[] arr) {
        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
        if(maxi < arr[i]){
            maxi=arr[i];
            cnt++;
        }
    }
        return cnt;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = greaterthanprevious(arr);
        // for(int a : arr) {
        //     System.out.print(a+" ");
        // }
        System.out.print(result);
        sc.close();
    }
}