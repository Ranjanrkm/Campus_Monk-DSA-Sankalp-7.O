import java.util.*;
public class Lstro {
    public static int  lnrstr(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int maxlen = 0;
        for(int r = 0; r < n; r++) {
            char currentChar = s.charAt(r);
            if(map.containsKey(currentChar)) {
                l = Math.max(map.get(currentChar) + 1, l);
            }
            map.put(currentChar, r);
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "mcxvwdeyqeyqo";
        int result = lnrstr(s);
        System.out.println("The maximum length is: "+result);
    
    }
}