public class countDigit {


    static int getDigit(int num) {
        int x = num;
    /*
        Brute force 
        TC = O(N)
        SC = O(1)
        
        int count = 0;
        while (num != 0) {
            // System.out.println(num);
            num = num / 10;
            count += 1;
        }
    */
    
    /*
        Better
        T.C. = O(1)
        S.C. = O(1)
        String strNumber = Integer.toString(num);
        return strNumber.length();
    */
        // T.C. = O(1)
        // S.C. = O(1)
        return ((int)Math.log10(x)) + 1;
    }

    

    public static void main(String[] args) {
        int num = 999;
        System.out.println(getDigit(num));
        System.out.println(1233/10);
    }
}