public class allDivisor {
    static void getAllDivisor(int num) {
        int n = num;
        /*
            Brute force

            for (int i = 1; i <=num; i++) {
                if(n%i == 0){
                    System.out.print(i + " ");
                }
            }
        */
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(n%i == 0){
                System.out.print(i + " ");
                if(n/i != i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        getAllDivisor(32);
    }
}
