import java.util.*;
public class zeroend {

    public static void move_zero_end(int[] arr) {
        // step 1 --> temp --> non zero store
        ArrayList<Integer>temp = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // step 2 --> temp --> move --> arr
        for(int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        // step 3 --> remaining 0 add
        for(int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        // function call
        move_zero_end(arr);
        for(int it : arr) {
            System.out.print(it+" ");
        }

        sc.close();
    }
}