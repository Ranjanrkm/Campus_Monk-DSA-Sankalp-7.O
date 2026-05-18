import java.util.*;
import java.io.*;

public class Max {
    public static int maxSumOptimal(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int prev2 = 0;
        int prev1 = arr[0];

        for (int i = 1; i < n; i++) {
            int pick = arr[i] + prev2;
            int notPick = prev1;
            
            int curr = Math.max(pick, notPick);
            
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(maxSumOptimal(arr));
    }
}