
import java.util.*;
public class Square {
static void swap(int[] arr, int left , int right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

    static int[] sort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = n-1;
        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int[] res = sort(arr);
        System.out.print("After sorting the array is : ");

        for(int num : res){
            System.out.print(num+" ");
        }


        sc.close();
    }
}