import java.util.*;
public class largest {

    public static int Largest1(int[] arr) {
        int large = Integer.MIN_VALUE;
        for(int a : arr) {
            if(large < a) {
                large = a;
            }
        }
        return large;
    }

    public static int Largest2(int[] arr) {
        int large = Integer.MIN_VALUE;
        for(int a : arr) {
            large = Math.max(large , a);
        }
        return large;
    }

    public static int Largest3(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n - 1];
    }
    public static void main(String args[]) {
        
        int arr[] = {3 , 34 , 32 , 67 ,39};
        int ans1 = Largest1(arr);
        System.out.println(ans1);
        int ans2 = Largest2(arr);
        System.out.println(ans2);
        int ans3 = Largest3(arr);
        System.out.println(ans3);
    }
}
