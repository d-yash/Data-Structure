public class bubbleRecurssion {
    static void bubbleSort(int arr[], int n){
        if(n == 1) return;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int []arr = {4,5,8,1,3,6};
        bubbleSort(arr, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
