public class insertion{
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j =  i - 1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,3,1,12,4};
        insertionSort(arr);
        printArray(arr);
    }
}