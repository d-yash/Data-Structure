public class findMissing {
    static int getMissingNumber(int arr[], int n){
        {
            int xor = 0, xorArray = 0;
            for (int i = 0; i < n-1; i++) {
                xor = xor ^ i;
                xorArray = xorArray ^ arr[i];
                System.out.println("xor : " + xor + "  xorArr : " + xorArray);
            }
            xor = xor ^ n;
            System.out.println("xor : " + xor + "  xorArr : " + xorArray);
    
            return xor - xorArray;
        }
        // {
        //     int sum = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         sum += arr[i];
        //     }
        //     int add = n*(n+1)/2;
        //     return add - sum;
        // }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        System.out.println(getMissingNumber(arr, arr.length+1));
    }
}
