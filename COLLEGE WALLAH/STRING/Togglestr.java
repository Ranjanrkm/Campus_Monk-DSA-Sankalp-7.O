import java.util.*;
public class Togglestr {
    public static void main(String[] args) {
        String str = "LegEND";
        System.out.println(str);
        //StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++) {
            boolean flag = true; // true -> capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;
            if(asci >= 97) flag = false; //small
            if(flag == true) { //capital
                asci += 32;
                char dh = (char)asci; //a
                str = str.substring(0,i) + dh + str.substring(i+1);
            } else { // small 
                asci -= 32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}