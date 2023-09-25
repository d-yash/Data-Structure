public class secondSmallest {
    static int findSecondLargest(int arr[]){
        int min = arr[0];
        int second_min = arr[0];
        {
            // Brute force <only applicable when there is no duplicate>
            // sort the array
            // return element at second last index
        }
        {
            //Better
            // for (int i = 0; i < arr.length; i++) {
            //     if(arr[i] < min){
            //         min = arr[i];
            //     }                
            // }
            // for (int i = 0; i < arr.length; i++) {
            //     if(arr[i]<second_min && arr[i]!=min){
            //         second_min = arr[i];
            //     }
            // }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                second_min = min;
                min = arr[i];
            }    
            else if(arr[i]<second_min && arr[i]!=min){
                second_min = arr[i];
            }
        }
        return second_min;
    }   
    public static void main(String[] args) {
        int arr[] = {4,8,2,12,3,6,1,2,5,3,4,59,34,12,0,59,6,4};
        System.out.println(findSecondLargest(arr));
    }    
}
