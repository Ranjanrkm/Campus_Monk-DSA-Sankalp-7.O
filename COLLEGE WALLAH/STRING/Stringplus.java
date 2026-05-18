import java.util.*;
public class Stringplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "def";
        str += 'r';
        str += 10;
        System.out.println(str);
        System.out.println("abc"+'r'+10+20);
        System.out.println(10 + 20 + "abc");

        sc.close();
    }
}