import java.util.*;
public class darray {
    public static void main(String args[]) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(10);

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}