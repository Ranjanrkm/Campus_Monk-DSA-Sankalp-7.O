import java.util.*;

public class ValidS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String S  = sc.nextLine();

        int countStar = 0;
        int countHash = 0;

        for(char c : S.toCharArray()) {
            if(c == '*') {
                countStar++;
            } else if(c == '#') {
                countHash++;
            }
        }
        int result = countStar - countHash;
        System.out.println("Output: "+result);

        sc.close();
    }
}