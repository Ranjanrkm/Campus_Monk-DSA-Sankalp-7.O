import java.util.*;
public class Sorted {
    public static boolean check(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }

        return true;
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
        boolean ans = check(arr);
        System.out.println(ans);

        sc.close();
    }
}