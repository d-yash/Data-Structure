public class linearSearch {
    static int linear(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,9,1,2,7};
        System.out.println(linear(arr, 9));
    }
}
