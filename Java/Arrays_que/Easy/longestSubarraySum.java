import java.util.HashMap;

public class longestSubarraySum {
    static int getSubarrayWithSumK(int arr[], int k) {

        // {
        //     // Brute approach
        //     // Using two loops for generating every subArray and then checking the sum
        //     int sum = 0, len = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         sum = 0;
        //         for (int j = i; j < arr.length; j++) {
        //             sum += arr[j];

        //             if (sum == k)
        //                 len = Math.max(len, j - i + 1);

        //         }
        //     }
        //     return len;
        // }

        // {
        //     // Using hashMap Better appraoch
        //     //If positive and negative both are given then this will be the optimal approach
        //     HashMap<Integer, Integer> map = new HashMap<>();
        //     int sum = 0, maxLen = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         sum += arr[i];

        //         if (sum == k)
        //             maxLen = Math.max(maxLen, i + 1);

        //         int rem = sum - k;
        //         if (map.containsKey(rem)) {
        //             int len = i - map.get(rem);
        //             maxLen = Math.max(maxLen, len);
        //         }

        //         if (!map.containsKey(sum)) {
        //             map.put(sum, i);
        //         }
        //     }
        //     return maxLen;
        // }
        int sum = arr[0];
        int left = 0, right = 0;
        int maxLen = 0;
        while(right < arr.length){
            while(sum > k && left <= right){
                sum -= arr[left];
                left++;
            }

            if(sum == k)
                maxLen = Math.max(maxLen, right-left+1);
            
            right++;
            if(right < arr.length){
                sum +=  arr[right];
            }
        }

        return maxLen;
    }   

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 2, 5 };
        int sum = 7;
        System.out.println(getSubarrayWithSumK(arr, sum));
    }
}
