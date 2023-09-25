import java.util.ArrayList;
import java.util.List;

public class pascleTriangle {
    static List<Integer> generateRow(int row){
        List<Integer> ansRow = new ArrayList<>();
        int ans = 1;

        ansRow.add(1);
        for (int i = 1; i < row; i++) {
            ans = ans * (row-i);
            ans = ans / i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    static void printPascle(int row){
        List<List<Integer>> ans =  new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            ans.add(generateRow(i));
        }

        for (List<Integer> li : ans) {
            for (int i : li) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        printPascle(5);
    }
}
