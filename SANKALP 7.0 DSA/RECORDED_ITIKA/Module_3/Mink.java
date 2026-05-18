import java.util.*;
public class Mink {
    public static ArrayList<Integer> fun(int[] arr, int k) {
        ArrayList<Integer> b = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < k){
                b.add(arr[i]);
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> c = fun(arr, k);
        for(int it : c){
            System.out.print(it+" ");
        }
        sc.close();
    }
}
