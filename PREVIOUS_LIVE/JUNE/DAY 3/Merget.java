import java.util.*;
public class Merget {
    public static void merge_sorted(int[] arr1, int[] arr2) {
       int m = arr1.length; 
       int n = arr2.length; 

       int l = m - 1;
       int r = 0;

       while(l >= 0 && r < n) {
        if(arr1[l] > arr2[r]) {
            int temp = arr1[l];
            arr1[l] = arr2[r];
            arr2[r] = temp;
            l--;
            r++;
        } else {
            break;
        }
       }
       Arrays.sort(arr1);
       Arrays.sort(arr2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        
        for(int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        merge_sorted(arr1 , arr2);
        System.out.print("[");
        for(int i = 0; i < m; i++) {
            System.out.print(arr1[i]+" ,");
        }
        for(int j = 0; j < n; j++) {
            if(j==n-1) {
                System.out.print(arr2[j]);
            } else {
            System.out.print(arr2[j]+" ,");
        }
        }
        System.out.print("]");
        sc.close();
    }
}