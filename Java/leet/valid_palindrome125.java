import java.util.ArrayList;

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric
// characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
import java.util.*;

public class valid_palindrome125 {
    public static void check_palin(String s){
        // char[] ch = s.toCharArray();
        // ArrayList<Character> ans = new ArrayList<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(Character.isLetter(ch) || Character.isDigit(ch)){
        //         ans.add(Character.toLowerCase(ch));
        //     }
        // }
        // ArrayList<Character> rev = new ArrayList<>(ans);
        // Collections.reverse(rev);
        
        // if(ans.equals(rev)){
        //     System.out.println(rev);
        //     System.out.println("TRUE");
        // }
        // else{
        //     System.out.println("FALSE");
        // }
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(i)){
                b.append(s.charAt(i));
            }
        }
        int n = b.length() - 1;
        for (int i = 0; i < n/2; i++) {
            if(b.charAt(i) != b.charAt(n-i))
                // return false;
                System.out.println("Flase");    
        }
        // return true;
        System.out.println("True");
    }
    public static void main(String[] args) {
        // check_palin("A man, a plan, a canal: Panama");
        // check_palin("race a car");
        check_palin("race a car");
    }
}
