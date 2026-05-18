
import java.util.*;
public class unio {

    public static int[] unionArr(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> uni = new ArrayList<>();
        while(i < n1 && i < n2) {
            if(arr1[i] <= arr2[j]) {
                if(uni.size() == 0 || uni.get(uni.size() - 1) != arr1[i]) {
                    uni.add(arr1[i]);
                }
                i++;
            } else {
                if(uni.size() == 0 || uni.get(uni.size() - 1) != arr2[j]) {
                    uni.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n1) {
            if(uni.size() == 0 || uni.get(uni.size() - 1) != arr1[i]) {
                uni.add(arr1[i]);
            }
            i++;
        }
        while(j < n2) {
            if(uni.size() == 0 || uni.get(uni.size() - 1) != arr2[j]) {
                uni.add(arr2[j]);
            }
            j++;
        }

        int[] res = new int[uni.size()];
        for(int k = 0; k < uni.size(); k++) {
            res[k] = uni.get(k);
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans1 = unionArr(arr1 , arr2);
        for(int it : ans1) {
            System.out.print(it+" ");
        }
        sc.close();
    }
}