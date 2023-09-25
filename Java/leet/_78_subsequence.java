// Problem: Print all the subsequences(continous/non-continous which are in order) of an array. 
// For eg: [3, 1, 2] have total 8 subsequences like [], [3], [1], [2], [3, 1], [3, 2], [1, 2], [3, 1, 2]

// Approach: Recursion
// Time Complexity: O(2^N * N)
// Space Complexity: O(N)

import java.util.ArrayList;

class _78_subsequence{
    static void find_subsequence(int index, int[] arr, ArrayList<Integer> ans, ArrayList<Integer> ds){
       if(index == arr.length && !ans.contains(ds.get(index))){
            ans.add(ds.get(index));
            return;
        }
        ds.add(arr[index]);
        find_subsequence(index+1, arr, ans, ds);
        ds.remove(ans.size()-1);
        find_subsequence(index+1, arr, ans, ds);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        int[] arr = {3,2,2};
        // find_subsequence(0, arr, ans, ds);
        ans.add(5);
        System.out.println(ans.contains(4));

    }
}