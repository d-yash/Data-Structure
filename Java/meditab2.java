import java.util.ArrayList;

public class meditab2 {
    static int checkPalindrome(String str) {
        ArrayList<String> al = new ArrayList<>();
        String[] strArray = str.split(" ");
        int count = 0;

        for (String i : strArray) {
            StringBuilder reversed = new StringBuilder(i);
            reversed.reverse();
            if(i.equals(reversed.toString())){
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "my mom dad are here";
        System.out.println(checkPalindrome(str));
    }
}
