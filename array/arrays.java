import java.util.*;

public class arrays {
    public static void main(String args[]) {
      int arr[];
      arr = new int[4];
      int b[];  
      b = new int[3];
     
      System.out.println(arr.length);
       int []c = {10 , 20 , 30};
       for(int i = 0; i < c.length; i++) {
        System.out.println(c[i]);
       }

       for(int a : c) {
        System.out.print(a+" ");
       }
    }
}
