import java.util.ArrayList;

public class socialPilot_q1{
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    static int lcm(int a, int b, int valueGCD){
        return (a*b)/valueGCD;
    }
    static ArrayList<Integer> solve(int k){
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 2; i < k; i++) {
            for (int j = i; j < k; j++) {
                int gcdValue = gcd(i, j);
                int lcmValue = lcm(i, j, gcdValue);
                if((lcmValue/gcdValue) == k){
                    al.add(i);
                    al.add(j);
                    return al;
                }
            }
        }

        al.add(-1);
        return al;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> al = solve(15);
        // for (Integer integer : al) {
        //     System.out.println(integer);
        // }
    }
}