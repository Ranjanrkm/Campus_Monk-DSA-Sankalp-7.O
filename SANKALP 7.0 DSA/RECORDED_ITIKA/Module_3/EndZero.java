import java.util.*;
public class EndZero {
    public static void ZeroEnd(int[] arr) {
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j != -1) {
           for(int i = j + 1; i < arr.length; i++) {
             if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
              }
            }
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
        ZeroEnd(arr);
        for(int it : arr){
            System.out.print(it+" ");
        }
        sc.close();
    }
}