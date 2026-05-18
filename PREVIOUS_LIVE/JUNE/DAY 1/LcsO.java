
import java.util.*;
public class LcsO {


    static int longestConsSeries(int[] arr, int n) {
        int longest = 0;
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        for(int it : st) {
            if(!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while(st.contains(x + 1)) {
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest , cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = longestConsSeries(arr , n);
        System.out.println(ans);



        sc.close();
    }
}