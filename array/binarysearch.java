import java.util.*;
public class binarysearch{

    public static int Binary_Search(int[] arr , int target) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
  
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arr[] = {10 , 20 , 30 , 40 , 50};
        int ans = Binary_Search(arr , target);
        System.out.println(ans);
        sc.close();
    }
}