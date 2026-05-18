import java.util.*;
public class SumPointer {
    public static boolean twosum(int arr[] , int target) {
 
        int n = arr.length;
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        while(l < r) {
            int sum = arr[l] + arr[r];
            if(sum == target){
                return true;
            } else if(sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        if(twosum(arr, target)){
           System.out.print("yes"); 
        } else{
            System.out.print("no");
        }
      
        sc.close();
    }
}
