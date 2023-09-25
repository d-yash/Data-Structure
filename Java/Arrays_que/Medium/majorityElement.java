import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class majorityElement {
    static int findMajorityElement(int arr[]) {
        // {
        //      Brute force : counting each element if count is more than n/2 then return it
        //     int count = 0;
        //     for (int i = 0; i < arr.length; i++) {
        //         count = 0;
        //         for (int j = 0; j < arr.length; j++) {
        //             if (arr[i] == arr[j])
        //                 count++;
        //         }
        //         if (count > (arr.length / 2)) {
        //             return arr[i];
        //         }
        //     }
        //     return -1;
        // }


        // {
            //Better approach using Hashmap , then checking the domination
            // HashMap<Integer, Integer> map = new HashMap<>();
            // for (int i = 0; i < arr.length; i++) {
            //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            // }
    
            // for (Entry<Integer, Integer> it : map.entrySet()) {
            //     if(it.getValue() > arr.length/2){
            //         return it.getKey();
            //     }
            // }
            // return -1;
        // }
        int element = 0, count = 0;
        for(int i : arr){
            if(count == 0){
                element = arr[i];
                count = 1;
            }
            else if(i == element)
                count++;
            else 
                count--;
        }
        return element;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        System.out.println(findMajorityElement(arr));
    }
}
