
import java.util.*;
public class Longestsub{
    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int l = 0, maxLen = 0;

        for(int r = 0; r < n; r++){
            char currentChar = s.charAt(r);
            if(map.containsKey(currentChar)) {
                l = Math.max(map.get(currentChar) + 1, l);
            }
            map.put(currentChar, r);
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
    public static void main(String[] args){
        String s = "cadbzabcd";
        int result = longestNonRepeatingSubstring(s);
        System.out.println("Length of longest substring without repeating characters: "+result);
    }
}