import java.util.*;

public class Dutch {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort(int[] arr) {

        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } 
            else if(arr[mid] == 1){
                mid++;
            } 
            else if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}