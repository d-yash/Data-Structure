public class armstrong {
    static boolean checkArmStrong(int num){
        int len = (Integer.toString(num)).length();
        int n = num;
        int total = 0;
        while(n != 0){
            int rem = n % 10;
            total += Math.pow(rem, len);
            n /= 10;
        }
        return (num == total);
    }
    public static void main(String[] args) {
        System.out.println(checkArmStrong(371));
    }
}
