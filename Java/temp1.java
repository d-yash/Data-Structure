public class temp1 {
    // static int bs(int arr[], int target){
    //     int low = 0;
    //     int high = arr.length-1;
        
    //     while(low <= high){
    //         int mid = low + (high - low)/2;
    //         if(arr[mid] == target)
    //             return mid;
    //         else if(arr[mid] > target)
    //             high = mid - 1;
    //         else 
    //             low = mid + 1;
    //     }
    //     return -1;
    // }
    static void printPrime(int n){
        int count = 0;
        int num = 2;
        while(count <= n){
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    static boolean isPrime(int n){
        if(n <= 1)
            return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,9,11,13,15};
        // System.out.println(bs(arr, 11));
        printPrime(25);
    }
}
