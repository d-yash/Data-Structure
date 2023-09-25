public class leftRotateOne {
    static void oneToLeft(int arr[]){
        {
            // int temp = arr[0];
            // int tempArray[] = new int[arr.length];
            // for (int i = 1; i < arr.length; i++) {
            //     tempArray[i-1] = arr[i];
            // }
            // tempArray[arr.length-1] = temp;
    
            // //copying
            // for (int i = 0; i < arr.length; i++) {
            //     arr[i] = tempArray[i];
            // }
        }
        {
            int temp = arr[0];
            int len = arr.length-1;
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }   
            arr[len] = temp;
        }
    }
    static void oneToRight(int arr[]){
        {
            //Brute force
            // int temp = arr[arr.length-1];
            // int tempArray[] = new int[arr.length];
            // for (int i = 0; i < tempArray.length-1; i++) {
            //     tempArray[i+1] = arr[i];
            // }
            // tempArray[0] = temp;

            // //copying
            // for (int i = 0; i < arr.length; i++) {
            //     arr[i] = tempArray[i];
        }
        {
            int temp = arr[arr.length-1];
            for (int i = arr.length-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        oneToRight(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
