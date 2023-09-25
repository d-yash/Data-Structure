import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class union {

    // Using HashMap

    // static ArrayList<Integer> union(int arr1[], int arr2[]){
    // HashMap<Integer, Integer> freq = new HashMap<>();
    // ArrayList<Integer> union = new ArrayList<>();

    // for (int i = 0; i < arr1.length; i++) {
    // freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
    // }

    // for(int it: freq.keySet()){
    // union.add(it);
    // }
    // return union;
    // }

    // Using Set
    // static HashSet<Integer> union(int arr1[], int arr2[]) {
    // HashSet<Integer> set = new HashSet<>();

    // for (int i = 0; i < arr1.length; i++) {
    // set.add(arr1[i]);
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // set.add(arr2[i]);
    // }
    // return set;
    // }

    // Using two pointers
    static ArrayList<Integer> union(int arr1[], int arr2[]) {
        int i = 0, j = 0; // pointers
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = {  2,4,6,7,8,9,9 };
        int arr2[] = { 0,1, 4, 5, 6, 8 };

        {
            // Using hashmap

            // ArrayList<Integer> al = union(arr1, arr2);
            // for(int i: al){
            // System.out.print(i + " ");
            // }
        }
        {
            // using set

            // Set<Integer> set = union(arr1, arr2);
            // for (int it : set) {
            // System.out.print(it + " ");
            // }
        }
        {
            // Using two pointers
            ArrayList<Integer> al = union(arr1, arr2);
            for (int i : al) {
                System.out.print(i + " ");
            }
        }
    }
}
