import java.sql.Time;

public class gcd {
    /*
        Brute force
        TC: O(Min(num1, num2))
        SC: O(1)
        static int getGCD(int num1, int num2){
            for(int i=Math.min(num1, num2); i>1; i--){
                if((num1%i == 0) & (num2%i==0)){
                    return i;
                }
            }
        return 1;
        }
     */
    /*
        // Better
        // Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.
        // Space Complexity: O(1).
        
        static int getGCD(int num1, int num2) {
            if (num2 == 0) {
                return num1;
            }
            return getGCD(num2, num1 % num2);
        }
     */
    static int getGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(getGCD(24, 30));

    }
}
