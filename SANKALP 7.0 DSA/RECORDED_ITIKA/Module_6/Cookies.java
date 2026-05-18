import java.util.*;
public class Cookies {

    public static int freq(int[] stu, int[] cook) {
        int n = stu.length;
        int m = cook.length;

        Arrays.sort(stu);
        Arrays.sort(cook);
        int l = 0, r = 0;
        while(l < n && r < m) {
            if(cook[r] >= stu[l]) {
                l++;
            }
            r++;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stu = new int[n];
        for(int i = 0; i < n; i++) {
            stu[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] cook = new int[m];
        for(int i = 0; i < m; i++) {
            cook[i] = sc.nextInt();
        }
        int ans = freq(stu, cook);
        System.out.println(ans);

        sc.close();
    }
}