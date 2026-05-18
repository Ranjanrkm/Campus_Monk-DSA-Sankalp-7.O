import java.util.*;
public class userinput {

    public static int array_sum(int[] arr) {
        int ans = 0;
        for(int a : arr) {
            ans+=a;
        }


        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        // System.out.print("printing the output : ");
        // for(int a : arr){
        //     System.out.print(a+" ");
        // }


        int ans = array_sum(arr);
        System.out.println(ans);
    }
}