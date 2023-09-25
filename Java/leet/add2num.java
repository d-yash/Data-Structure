import java.util.*;

public class add2num {
    static void twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        System.out.println(map);
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                System.out.println(i + map.get(rem));
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        // int[] ans = new int[]{};
        twoSum(arr, 6);
        // System.out.println(ans);   
    }
}
