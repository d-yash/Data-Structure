import java.util.HashMap;
import java.util.Map;

public class appearOnce {
    static int getOneApperiance(int arr[]){
        // {
        //     //Brute
        //     int count;
        //     for (int i = 0; i < arr.length; i++) {
        //         count = 0;
        //         for (int j = 0; j < arr.length; j++) {
        //             if(arr[j] == arr[i])
        //                 count++;
        //         }
        //         if(count == 1)  
        //             return arr[i];
        //     }
        //     return -1;
        // }
        // {
            // Better

            // HashMap<Integer, Integer> mpp = new HashMap<>();
    
            // for (int i = 0; i < arr.length; i++) {
            //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
            // }
    
            // for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            //     if(it.getValue() == 1){
            //         return it.getKey();
            //     }
            // }
            // return -1;
        // }
        {
            int xor = 0;
            for (int i = 0; i < arr.length; i++) {
                xor = xor ^ arr[i];
            }
            return xor;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,3,3,0};
        System.out.println(getOneApperiance(arr));
    }
}
