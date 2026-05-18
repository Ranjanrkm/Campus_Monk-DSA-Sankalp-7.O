import java.util.*;
public class inputArr{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        // case 1 --> n given it means n elements
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
