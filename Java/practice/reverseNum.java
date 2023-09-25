public class reverseNum {
    static int revNum(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int rem = temp % 10; 
            rev = (rev*10) + rem;
            temp /= 10;
        }
        return rev;
        // For palindrome
        // System.out.println(num+ " " + rev);
        // return (num == rev);
    }
    public static void main(String[] args) {
        int num = 1214;
        System.out.println(revNum(num));
    }
}
