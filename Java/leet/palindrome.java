public class palindrome {
    static boolean palin(int x){
        int rev = 0, og = x;
        while(x != 0){
            int rem = x % 10;
            rev = (rev * 10) + rem;
            System.out.println("Rev " + rev);
            x /= 10;
        }
        if(og == rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ans = palin(121);
        System.out.println(ans);
    }
}