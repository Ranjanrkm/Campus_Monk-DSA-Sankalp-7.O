import java.util.*;
public class Odupli {

    public static int remove(int[] nums, int n) {
        if(n == 0) {
            return 0;
        }
        int i = 0;
        for(int j = i; j < n; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = remove(arr , n);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}