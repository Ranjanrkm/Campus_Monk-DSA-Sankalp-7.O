import java.util.*;
public class Majority {

    public static int element1(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if(cnt > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int element2(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i =0 ; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > (n / 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }

// Optimal Approach: Moore's Voting Algorithm
    // Time Complexity: O(N), Space Complexity: O(1)
    public static int element3(int[] arr) {
        int n = arr.length;
        int count = 0;
        int candidate = 0; // Using 'candidate' makes the logic easier to read
        
        // Phase 1: Find a potential majority candidate
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                // BUG FIX: When count is 0, we pick the new element AND reset count to 1
                candidate = arr[i];
                count = 1; 
            } else if (candidate == arr[i]) {
                // If it's the same as our candidate, increase the vote
                count++;
            } else {
                // If it's different, decrease the vote
                count--;
            }
        }
        
        // Phase 2: Verify if the candidate actually appears more than N/2 times
        int verifyCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                verifyCount++;
            }
        }
        
        // If the verified count is strictly greater than half the array size, return it
        if (verifyCount > (n / 2)) {
            return candidate;
        }
        
        // Otherwise, no majority element exists
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans1 = element1(arr);
        System.out.println(ans1);

        int ans2 = element2(arr);
        System.out.println(ans2);

        int ans3 = element3(arr);
        System.out.println(ans3);
        sc.close();
    }
}
