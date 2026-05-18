import java.util.*;
public class Odd {
    public static String longest(String s) {
        int i;
        int idx = -1;
        for(i = s.length() - 1; i >= 0; i--) {
            if((s.charAt(i) - '0') % 2 == 1) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            return "";
        }
        int j = 0; 
        while(j <= idx && s.charAt(j) == '0') {
            j++;
        }
        return s.substring(j, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = longest(s);
        System.out.println(ans);
        sc.close();
    }
}
