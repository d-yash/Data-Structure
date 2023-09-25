import java.util.*;

public class nextPermutation {
    static List<Integer> generateNextPermutation(List<Integer> li){
        int n = li.size();
        int ind = -1;

        for (int i = n-2; i >= 0; i--) {
            if(li.get(i) < li.get(i+1)){
                ind = i;
                break;
            }
        }

        //permutation is last permutation -> we will reverse it to get the first permutation
        if(ind == -1){
            Collections.reverse(li);
            return li;
        }

        for (int i = n-1; i > ind; i--) {
            if(li.get(i) > li.get(ind)){
                //swapping
                int temp = li.get(ind);
                li.set(ind, li.get(i));
                li.set(i, temp);
                break;
            }
        }

        List<Integer> tempLi = li.subList(ind+1, n);
        Collections.reverse(tempLi);
        return li;
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = generateNextPermutation(li);

        System.out.println(ans);
    }
}
