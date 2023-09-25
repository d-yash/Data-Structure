// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""

// Explanation: There is no common prefix among the input strings.


public class 14_longest_common_prefix {
    public void common_prefix(String[] strs){
        int n = strs.len();
        for(int i=0; i<n; i++){
            for(int j=0; j)
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        common_prefix(arr);
    }
}
