import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println(numSub(s));
        }
        sc.close();
    }

    public static int numSub(String s) {
        long totalSubstrings = 0;
        long currentLength = 0;
        int mod = 1000000007;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currentLength++;
                totalSubstrings = (totalSubstrings + currentLength) % mod;
            } else {
                currentLength = 0;
            }
        }
        return (int) totalSubstrings;
    }
}