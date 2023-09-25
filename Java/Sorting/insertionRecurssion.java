public class insertionRecurssion {
    static void insertionSort(int arr[], int i, int n){
        if(i == n) return;

        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--; 
        }
        insertionSort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int []arr = {4,6,3,2,1,8};
        insertionSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
