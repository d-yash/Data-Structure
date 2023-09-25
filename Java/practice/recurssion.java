public class recurssion {
    static void sumN(int n) {
        if(n == 1)
            return;
            sum *= n;
        sumN(n-1);
    }   
    static int fact(int n){
        if(n == 1)
            return 1;
        else 
            return n*fact(n-1);
    }
    static int sum = 0;
    public static void main(String[] args) {
        // sumN(5);
        System.out.println(fact(5));
    }
}
