public class moveZero {
    static void moveZeroToEnd(int arr[]){
        {
            //Brute force

            // int temp[] = new int[arr.length];
            // int j = 0;
            // for (int i = 0; i < arr.length; i++) {
            //     if(arr[i] != 0){
            //         temp[j] = arr[i];
            //         j++;
            //     }
            // }
            // for (int i = j; i < arr.length; i++) {
            //     temp[i] = 0;
            // }
            // for (int i = 0; i < temp.length; i++) {
            //     arr[i] = temp[i];
            // }
        }
        {
            // Optimal - Two pointer method
            int j = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    j = i;
                    break;
                }
            }
            if(j == -1) return;
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,0,0,3};
        moveZeroToEnd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
