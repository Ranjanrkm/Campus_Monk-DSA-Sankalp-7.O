import java.util.HashMap;
import java.util.Scanner;

public class SubSum {

    // Method to find how many times the array is rotated
    public static int sum(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int preSum = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            preSum += arr[i];
            int rem = preSum - k;
            if(mp.containsKey(rem)) {
                cnt += mp.get(rem);
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int ans = sum(arr, k);
            System.out.println(ans);
        }
        sc.close();
    }
}