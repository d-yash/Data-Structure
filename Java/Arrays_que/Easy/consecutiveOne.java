public class consecutiveOne{
    static int getConsecutiveOne(int arr[]){
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                count++;
            else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,1,1,1,0,1,1,0};
        System.out.println(getConsecutiveOne(arr));
    }
}