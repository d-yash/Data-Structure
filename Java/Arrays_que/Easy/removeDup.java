import java.util.HashSet;

public class removeDup {
    
    static int removeDuplicates(int arr[]){
    {
        // // Brute force : using hashset
        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     hs.add(arr[i]);
        // }
        // int i = 0;
        // for(int x : hs){
        //     arr[i++] = x;
        // }
        // return hs.size();
    }
    {
        // Optimal 

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,4,4,5,6,8,8};
        int len = removeDuplicates(arr);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
