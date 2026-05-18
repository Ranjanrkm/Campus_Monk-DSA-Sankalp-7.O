
import java.util.*;
public class Subso {
    public static int sub_array(int[] arr, int n, int k) {
        HashMap<Integer , Integer> prefixSumMap = new HashMap<>();
        int currentPrefixSum = 0, subarrayCount = 0;

        prefixSumMap.put(0 , 1);

        for(int i = 0; i < n; i++) {
            currentPrefixSum += arr[i];
            int sumToRemove = currentPrefixSum - k;

            subarrayCount += prefixSumMap.getOrDefault(sumToRemove,0);
            prefixSumMap.put(currentPrefixSum , prefixSumMap.getOrDefault(currentPrefixSum , 0) + 1);
        }
        return subarrayCount;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int ans = sub_array(arr, n, k);
        System.out.println(ans);


        sc.close();
    }
}