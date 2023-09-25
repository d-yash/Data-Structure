public class secondLargest {
    static int findSecondLargest(int arr[]) {
        int max = arr[0];
        int second_max = arr[0];
        {
            // Brute force <only applicable when there is no duplicate>
            // sort the array
            // return element at second last index
        }
        {
            // Better
            // for (int i = 0; i < arr.length; i++) {
            // if(arr[i] > max){
            // max = arr[i];
            // }
            // }
            // for (int i = 0; i < arr.length; i++) {
            // if(arr[i]>second_max && arr[i]!=max){
            // second_max = arr[i];
            // }
            // }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 2, 12, 3, 6, 5, 3, 4, 59, 34, 12, 0, 59, 6, 4 };
        System.out.println(findSecondLargest(arr));
    }
}
