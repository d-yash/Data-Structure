public class selection {
	static int select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j] < arr[min])
                min = j;
        }
        return min;
	}
	static void selectionSort(int arr[], int n)
	{
        for(int i=0; i<n; i++){
            int minIndex = select(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }	    
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,1,9,11};
        int n = 7;
        printArr(arr);
        selectionSort(arr, n);
        printArr(arr);
    }
    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}
