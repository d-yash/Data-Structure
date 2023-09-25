public class prime {
    static boolean checkPrime(int num){
        int n = num;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(29));
    }
}
