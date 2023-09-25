public class largest {
    public static void main(String[] args) {
        int arr[] = {4,8,2,1,3,6,5,3,4,8,12,0,59,6,4};
        
        // // Brute
        // // Sort the Array and return last index
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);
        
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
