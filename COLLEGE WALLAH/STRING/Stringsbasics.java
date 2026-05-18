import java.util.*;
public class Stringsbasics {
    public static void main(String[] args) {
        String str = "Ranjan The Legend";
        System.out.println(str);
        System.out.println(str.charAt(3));
        char ch = str.charAt(1);
        System.out.println(ch);
        System.out.println(str.indexOf('a'));
        String gtr = "Pragati Shah";
        System.out.println(str.compareTo(gtr));


        Scanner sc = new Scanner(System.in); 

        // String s = sc.next();
        // System.out.println(s); 

        String s1 = sc.nextLine();
        System.out.println(s1);

        int len = str.length();
        int len1 = s1.length();

        System.out.println(len);
        System.out.println(len1);

        
    }
}