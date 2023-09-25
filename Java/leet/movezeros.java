public class movezeros {
    static void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; i<nums.length-1; j++){
                if(nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
