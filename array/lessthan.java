import java.util.*;
public class lessthan {
    public static ArrayList<Integer> fun(int[] arr , int k) {
        ArrayList<Integer>b = new ArrayList<>();

        // traverse and check k small arraylist insert

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < k) {
                b.add(arr[i]);
            }
        }

        return b;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array : ");
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the value of k : ");
    int k = sc.nextInt();
    ArrayList<Integer>c= fun(arr , k);

    for(int it : c){
        System.out.print(it+" ");
    }

    


    sc.close();
   } 
}