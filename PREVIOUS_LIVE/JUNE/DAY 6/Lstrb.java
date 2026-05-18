import java.util.*;
public class Lstrb {
    public static int nrsubstr(String s) {
        int n = s.length();
        int maxlen = 0;
        for(int i = 0; i < n; i++) {
            int[] hash = new int[256];
            Arrays.fill(hash,0);
            for(int j = i; j < n; j++) {
                if(hash[s.charAt(j)] == 1) break;
                hash[s.charAt(j)] = 1;
                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String input = "cadbzabcd";
        int length = nrsubstr(input);
        System.out.println("Length of longest substring without repeating characters: "+length);
    }
}