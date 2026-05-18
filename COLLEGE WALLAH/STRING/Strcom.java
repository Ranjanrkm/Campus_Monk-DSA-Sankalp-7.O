import java.util.*;
public class Strcom {
    public static void main(String[] args) {
        String str = "aaabbbbcddeeeeeee";
        String ans = "" + str.charAt(0);
        int cnt = 1;
        for(int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(curr == prev) {
                cnt++;
            } else {
                if(cnt > 1) ans += cnt;
                cnt = 1;
                ans += curr;
            }
        }
        if(cnt > 1) ans += cnt;
        System.out.println(ans);
    }
}
