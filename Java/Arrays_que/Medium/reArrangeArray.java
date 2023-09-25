import java.util.ArrayList;

public class reArrangeArray {
    static void reArrange(int arr[]){
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // ArrayList<Integer> ans = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] >= 0){
        //         pos.add(arr[i]);
        //     }
        //     else{
        //         neg.add(arr[i]);
        //     }
        // }
        // int i = 0, j = 0; 

        // while(i<pos.size() && j<neg.size()){
        //     ans.add(pos.get(i++));
        //     ans.add(neg.get(j++));
        // }
        // while(i<pos.size()){
        //     ans.add(pos.get(i++));  
        // }
        // while(j<neg.size()){
        //     ans.add(neg.get(j++));
        // }
        // return ans;
        int ans[] = new int[arr.length];
        int posInd = 0, negInd = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ind " + i + "\t" + arr[i]);
            if(arr[i] < 0){
                ans[negInd] = arr[i];
                negInd += 2;
            }
            else{
                ans[posInd] = arr[i];
                posInd += 2;
            }
        }

        for (int i : ans) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-3,-1,-2, 3};
        reArrange(arr);
        // System.out.println(reArrange(arr));
    }
}
