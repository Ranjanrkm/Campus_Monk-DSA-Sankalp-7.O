import java.util.*;
public class Bzeroe {
    public static void move(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();
        for(int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }
        for(int i = nz; i < n; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        move(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}