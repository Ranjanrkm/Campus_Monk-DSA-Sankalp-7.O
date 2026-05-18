import java.util.Scanner;

public class CntSay {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            char prev = s.charAt(0);

            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == prev) {
                    cnt++;
                } else {
                    sb.append(cnt).append(prev);
                    prev = c;
                    cnt = 1;
                }
            }
            sb.append(cnt).append(prev);
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(countAndSay(n));
        }
        sc.close();
    }
}