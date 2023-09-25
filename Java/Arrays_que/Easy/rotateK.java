public class rotateK {
    static void leftRotateKPlace(int arr[], int n, int k){
        k = k%n;
        if(n == 0)  return;
        if(k > n)   return;
        {
            //Brute force
            // int temp[] = new int[n];
            // for (int i = 0; i < k; i++) {
            //     temp[i] = arr[i];
            // }
            // for (int i = 0; i < n-k; i++) {
            //     arr[i] = arr[i+k];
            // }
            // for (int i = n-k; i < n; i++) {
            //     arr[i] = temp[i-n+k];
            // }
        }
        {
            //Reversal algorithm
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);       
            reverse(arr, 0, n-1);     
        }
    }
    static void rightRotateKPlace(int arr[], int n, int k){
        {
            // int temp[] = new int[k];
            // for (int i = n-k; i < n; i++) {
            //     temp[i+k-n] = arr[i];            
            // }
            // for (int i = n-k-1; i >=0; i--) {
            //     arr[i+k] = arr[i];
            // }   
            // for (int i = 0; i < k; i++) {
            //     arr[i] = temp[i];
            // }
        }
        reverse(arr, 0, k);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int arr[], int low, int high){
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // leftRotateKPlace(arr, arr.length, 2);
        rightRotateKPlace(arr, arr.length, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
