public class consecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, finalMax = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
            {
                max += 1;
            }
            else{
                if(finalMax <= max)
                {
                    finalMax = max; 
                }
                max = 0;
            }
        }
        if(max > finalMax)
            return max;
        else 
            return finalMax;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
