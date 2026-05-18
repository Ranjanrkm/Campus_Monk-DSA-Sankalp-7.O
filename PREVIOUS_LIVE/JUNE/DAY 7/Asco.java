import java.util.*;
public class Asco {
    public static int max(int[] stu , int[] cook) {
        int n = stu.length;
        int m = cook.length;
        int l = 0, r = 0;

        Arrays.sort(stu);
        Arrays.sort(cook);

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
        for(int i = 0; i < n; i++){
            stu[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] cook = new int[m];
        for(int i = 0; i < m; i++){
            cook[i] = sc.nextInt();
        }

        int result = max(stu , cook);
        System.out.println(result);

        sc.close();
    }
}