import java.util.*;
public class Frequency {

    public static void freq(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        //array elements map insert with its frequency
        for(int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

        }
        //map print
        for(Map.Entry<Integer, Integer> st : mp.entrySet()){
            System.out.println(st.getKey()+" -->"+st.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        freq(arr);

        sc.close();
    }
}
