import java.util.*;
public class ZeroEnd {
    public static void EndZero(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        for(int i = 0; i < temp.size(); i++){
            arr[i] = temp.get(i);
        }

        for(int i = temp.size(); i < arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            // sc.nextLine();
        }
        EndZero(arr);
        for(int it : arr){
            System.out.print(it+" ");
        }
        sc.close();
    }
}