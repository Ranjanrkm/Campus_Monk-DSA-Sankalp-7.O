import java.util.Arrays;
import java.util.Scanner;

public class Cookie {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child_i = 0;
        int cookie_j = 0;
        
        while (child_i < g.length && cookie_j < s.length) {
            if (s[cookie_j] >= g[child_i]) {
                child_i++;
            }
            cookie_j++;
        }
        
        return child_i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] g = new int[n];
            for (int i = 0; i < n; i++) g[i] = sc.nextInt();
            
            int m = sc.nextInt();
            int[] s = new int[m];
            for (int i = 0; i < m; i++) s[i] = sc.nextInt();
            
            System.out.println(findContentChildren(g, s));
        }
        sc.close();
    }
}
