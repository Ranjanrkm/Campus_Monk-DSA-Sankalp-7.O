import java.util.*;
public class ZeroOne {
static void swap(int[] arr, int left , int right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

    static void sort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right) {
            if(arr[left] == 1 && arr[right] == 0) {
                swap(arr , left , right);
                left++;
                right--;
            }
            if(arr[left] == 0) {
                left++;
            } 
            if(arr[right] == 1) {
                right--;
            }
        }
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
        sort(arr);
        System.out.print("After sorting the array is : ");

        for(int num : arr){
            System.out.print(num+" ");
        }


        sc.close();
    }
}