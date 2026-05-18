import java.util.*;
public class Union {

    public static int[] unionArr(int[] arr1, int[] arr2) {
        Set<Integer> st = new TreeSet<>();
        for(int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }
        int[] uni = new int[st.size()];
        int index = 0;
        for(int it : st) {
            uni[index++] = it;
        }
        return uni;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans1 = unionArr(arr1 , arr2);
        for(int it : ans1) {
            System.out.print(it+" ");
        }
        sc.close();
    }
}