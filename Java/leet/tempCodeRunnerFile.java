import java.util.ArrayList;
import java.util.*;

public class subsequence_powset {
    static ArrayList<String> subsequence(String s){
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        for(int i=0; i<(1<<n); i++){
            String sub = "";
            for(int j=0; j<n; j++){
                //checking if i th bit is set or not
                if((i & (1 << j))!=0)
                sub += s.charAt(j);
            }
            if(sub.length() > 0){
                ans.add(sub);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = subsequence(s);
        System.out.println("Subsequences are ..../n");
        for(String it : ans){
            System.out.println(it + " ");
        }
    }
}
