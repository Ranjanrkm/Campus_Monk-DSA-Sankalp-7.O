import java.util.*;
public class zeroend2nd {

    public static void end_zero(int[] arr) {
        // first j --> non zero
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // 2nd step
        if(j != -1){
        for(int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        end_zero(arr);
        for(int it : arr) {
            System.out.print(it+" ");
        }
        sc.close();
    }
}
