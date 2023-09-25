import java.util.ArrayList;
import java.util.*;
// can I get some time to understand this code?
// okay
public class subsequence_powset {
    static ArrayList<String> subsequence(String s){
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        for(int i=1; i<(1<<n); i++){    // why this condition? 
            String sub = "";
            for(int j=0; j<n; j++){
                //checking if j th bit is set or not
                if((i & (1 << j))!=0){
                    sub += s.charAt(j);
                }
            }
            if(sub.length() > 0){
                ans.add(sub);
            }
        }
        ans.add(" ");   //for adding blank space
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
