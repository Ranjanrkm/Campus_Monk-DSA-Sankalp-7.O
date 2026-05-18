import java.util.*;
public class Bdupli {

    public static int remove(int[] nums, int n) {
        Set<Integer> s = new LinkedHashSet<>();
        for(int i = 0; i < n; i++) {
            s.add(nums[i]);
        }
        int k = s.size();
        int j = 0;
        for(int val : s) {
            nums[j++] = val;
        }
        return k;
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