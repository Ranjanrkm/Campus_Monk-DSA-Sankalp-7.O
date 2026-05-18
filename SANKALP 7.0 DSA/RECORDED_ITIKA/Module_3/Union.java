import java.util.*;
public class Union {
    public static ArrayList<Integer> union1(int[] a, int[] b) {
        Set<Integer> st = new HashSet<>();

        for (int it : a) {
            st.add(it);
        }
        for (int it : b) {
            st.add(it);
        }

        return new ArrayList<>(st);
    }

    public static ArrayList<Integer> union2(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            } else { // equal
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> ans1 = union1(a, b);
        for (int it : ans1) {
            System.out.print(it + " ");
        }
        System.out.println();

        ArrayList<Integer> ans2 = union2(a, b);
        for (int it : ans2) {
            System.out.print(it + " ");
        }

        sc.close();
    }
}