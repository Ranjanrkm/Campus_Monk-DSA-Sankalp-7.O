import java.util.*;
public class ndlargest {
    public static int Sec_largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int seclargest = -1;
        for(int i = (n-2); i >= 0; i--){
            if(arr[i] != arr[n-1])  {
                seclargest =  arr[i];
                break;
            }
        }
        return seclargest;
    }

    public static int Sec_largest1(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ) {
            largest = Math.max(largest , arr[i]);
        }  

        int seclargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > seclargest && arr[i] != largest) {
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String args[]) {
        int arr[] = {1 , 54 , 3 , 32 , 78 , 4 , 78};
        int ans = Sec_largest(arr);
        System.out.println(ans);
        int ans1 = Sec_largest1(arr);
        System.out.println(ans1);
    }
}
