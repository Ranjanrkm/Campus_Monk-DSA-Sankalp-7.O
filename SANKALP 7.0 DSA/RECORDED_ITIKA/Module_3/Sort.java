import java.util.*;
public class Sort {
    public static void sort(int[] arr) {
       
       int n = arr.length;
       int zero = 0;
       int one = 0;
       int two = 0;
       

       for(int i = 0; i < n; i++){
        if(arr[i] == 0) zero++;
        else if(arr[i] == 1) one++;
        else two++;
       }

       for(int i = 0; i < zero; i++){
            arr[i] = 0;
       }
       for(int i = zero; i < zero + one; i++){
            arr[i] = 1;
       }
       for(int i = zero + one; i < n; i++){
            arr[i] = 2;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // sc.nextLine();
        }
        sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
       

        sc.close();
    }
}