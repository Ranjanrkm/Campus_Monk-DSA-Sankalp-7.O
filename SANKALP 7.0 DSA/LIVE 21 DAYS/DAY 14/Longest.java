import java.util.*;
public class Longest {
    public static int max(int[] arr) {
        int n = arr.length;

        if(n < 1) return 0;
        int maxi = 1;
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < n; i++) {
            st.add(arr[i]);
        }

        for(int it : st) {
            if(!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while(st.contains(x+1)) {
                    x += 1;
                    cnt++;
                }
                maxi = Math.max(maxi, cnt);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = max(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}
