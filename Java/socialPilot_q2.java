public class socialPilot_q2 {
    static int equalArray(int a[], int b[], int n){
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i<n && j>=0 && i<=j){
            a[i] += 1;
            b[j] += 1;

            a[j] -= 1;
            b[i] -= 1;

            if((a[i] == b[i]) && (a[j] == b[j])){
                count++;
            }
            else{
                return 0;
            }
            i++;
            j--;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {3,2,1};

        System.out.println(equalArray(a, b, a.length));
    }
}
