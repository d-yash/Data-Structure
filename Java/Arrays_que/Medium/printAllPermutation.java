import java.util.*;

public class printAllPermutation {
    static void recursivePermutation(int ind, int nums[], List<List<Integer>> ans){
        if(ind == nums.length){
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                sub.add(nums[i]);
            } 
            ans.add(sub);
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(i, ind, nums);
            recursivePermutation(ind+1, nums, ans);
            swap(i, ind, nums);
        }
    }

    private static void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    } 
    
    static void printAll(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        recursivePermutation(0, nums, ans);

        for (List<Integer> li : ans) {
            System.out.println(li);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        printAll(nums);
    }    
}
