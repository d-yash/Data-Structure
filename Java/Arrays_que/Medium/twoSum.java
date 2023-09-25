import java.util.ArrayList;
import java.util.HashMap;

public class twoSum {
    static int[] getTwoSum(int arr[], int target) {
        // {
        //      Brute approach 
        //  
        //     int ans[] = new int[2];
        //     ans[0] = ans[1] = -1;

        //     for (int i = 0; i < arr.length; i++) {
        //         for (int j = 0; j < arr.length; j++) {
        //             if ((arr[i] + arr[j]) == target) {
        //                 ans[0] = i;
        //                 ans[1] = j;
        //                 return ans;
        //             }
        //         }
        //     }
        //     return ans;
        // }

        // {
        //     //Better approch 
        //     //Using hashmap
        //     int ans[] = new int[2];
        //     ans[0] = ans[1] = -1;
        //     HashMap<Integer, Integer> map = new HashMap<>();
    
        //     for (int i = 0; i < arr.length; i++) {
        //         int rem = target - arr[i];
        //         if(map.containsKey(rem)){
        //             ans[0] = map.get(rem);
        //             ans[1] = i;
        //             return ans;
        //         }
        //         map.put(arr[i], i);
        //     }
        //     return ans;
        // }
        int left = 0, right = arr.length - 1;
        int ans[] = {-1,-1};
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                ans[0] = left;
                ans[1] = right;
                return ans; 
            }
            if(sum < target)
                left++;
            else 
                right--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int ans[] = getTwoSum(arr, 14);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
