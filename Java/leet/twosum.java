class twosum {
    static int[] sol(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            int sum = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(sum < target){
                    sum += nums[j];
                }
                if(sum == target){
                    int arr[] = {i, j};
                    return arr;
                }
                else{
                    break;
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] que = {3,3};
        int[] ans = sol(que, 6);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
