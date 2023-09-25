public class kandane {
    static long getMaximumSum(int arr[]){
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        int startInd = -1, endInd = -1, start = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // if(sum == 0){
            //     start = i;
            // }
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
            if(sum > max){
                max = sum;
                startInd = start;
                endInd = i;
            }

        }
        
        for (int i = startInd; i <= endInd; i++) {
            System.out.print(arr[i] + " ");
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-1,4,-1,2,1,-5,4};
        System.out.println("\nMaximum sum : " + getMaximumSum(arr));
    }
}