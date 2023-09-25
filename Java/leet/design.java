import java.util.Scanner;

public class design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      
        int w = sc.nextInt();
        int m = sc.nextInt();
        int start = 1, count = 0;
        while(start <= n){
            start += m;
            if(start >= n){
                break;
            }
            start += w;
            count++;
            if(start >= n){
                break;
            }
            start += m;
        }
        System.out.println(count);
    }
}
