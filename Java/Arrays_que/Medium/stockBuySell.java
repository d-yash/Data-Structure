public class stockBuySell {
    static int BuySell(int arr[]){
        // {
            //Brute force 
            // int maxProfite = 0;
            // for (int i = 0; i < arr.length; i++) {
            //     for (int j = i+1; j < arr.length; j++) {
            //         if(arr[j] > arr[i]){
            //             maxProfite = Math.max(maxProfite, arr[j]-arr[i]);
            //         }
            //     }
            // }
            // return maxProfite;
        // }
        int maxProfite = 0, minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
            maxProfite = Math.max(maxProfite, arr[i]-minValue);
        }
        return maxProfite;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(BuySell(arr));
    }
}
