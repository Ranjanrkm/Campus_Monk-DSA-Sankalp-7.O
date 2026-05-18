import java.util.*;
public class LinearSearch {

    public static int search(int[] arr, int target){
        int n = arr.length;
        int index = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int ans = search(arr , target);
        System.out.println(ans);
        sc.close();
    }
}