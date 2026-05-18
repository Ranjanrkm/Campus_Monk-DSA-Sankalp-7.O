import java.util.*;
class Encryption{

    public static String encryption(String s,int key){
        StringBuffer ans = new StringBuffer();
        if(key < 0){
            return "invalid input";
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                char newvalue = (char)((((ch - '0') + key)%10) + '0');
                ans.append(newvalue);
            } else if(ch >= 'a' && ch <= 'z'){
                char newvalue = (char)((((ch - 'a')+key)%26)+'a');
                ans.append(newvalue);
            } else if(ch >= 'A' && ch <= 'Z'){
                char newvalue = (char)((((ch - 'A')+key)%26)+'A');
                ans.append(newvalue);
            } else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int key = sc.nextInt();
       sc.nextLine();
       String s = sc.nextLine();

       String ans = encryption(s,key);
       System.out.println(ans);
       
       sc.close();
    }
}