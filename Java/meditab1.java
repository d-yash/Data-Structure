import java.util.ArrayList;
import java.util.HashMap;

public class meditab1 {
    static void findMissing(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        for (int i = 1; i < 10; i++) {
            if(!al.contains(i)){
                ans.add(i);
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,8,9,10};
        findMissing(arr);
    }
}
