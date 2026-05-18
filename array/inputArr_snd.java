import java.util.*;

public class inputArr_snd{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // case 2 --> size not known , 1 , 2 , 3, 4 ,5, 
        // logic --> array starting string

        String input = sc.nextLine();
        String arr[] = input.split(",");
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
