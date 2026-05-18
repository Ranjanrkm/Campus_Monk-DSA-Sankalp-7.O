import java.util.*;
public class dupli{

    public static int[] remove(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        if(n == 0) return new int[0];

        temp.add(arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]) {
                temp.add(arr[i]);
            }
        }
        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] unique = remove(arr , n);
        for(int a : unique) {
            System.out.print(a+" ");
        }
        sc.close();
    }
}