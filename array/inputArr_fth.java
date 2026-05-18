import java.util.*;

public class inputArr_fth{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // case 4 --> size not known , [1 2 3 4 5] , {1 , 2 , 3 , 4 , 5}
        // logic --> array starting string

        String input = sc.nextLine();

        if(input.startsWith(  "[") && input.endsWith("]")) {
        input = input.substring(1 , input.length() - 1);
        }
        String arr[] = input.split(" ");
        ArrayList<Integer>ar = new ArrayList<>();
        // '1' --> 1
        for(String token : arr){
            int num = Integer.parseInt(token);
            ar.add(num);
        }

        for(int i : ar){
            System.out.print(i+" ");
        }

    }
}
