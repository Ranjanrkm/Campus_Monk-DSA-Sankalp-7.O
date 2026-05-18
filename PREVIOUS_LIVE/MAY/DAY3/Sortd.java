import java.util.*;
public class Sortd {

    public static void sort_array(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
                
            } else if(arr[mid] == 1) {
                mid++;

            } else if(arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort_array(arr , n);
        for(int it : arr) {
            System.out.print(it+" ");
        }
        
        sc.close();
    }
}