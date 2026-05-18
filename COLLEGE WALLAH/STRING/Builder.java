import java.util.*;
public class Builder {
   public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // str.append("world");
        System.out.println(str);
        //hello -> mello
        str.setCharAt(0,'m');
         System.out.println(str);

         str.append(" world");
         System.out.println(str);
         str.insert(2,'y');
         System.out.println(str);
         str.deleteCharAt(0);
         System.out.println(str);
   } 
}
