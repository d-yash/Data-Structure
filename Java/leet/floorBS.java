public class floorBS {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int l = 0, h = arr.length-1, m, ind = -1;
        while(l <= h){
            m = (l + h) / 2;
            if(target == arr[m])
                ind = m;
            else if(target > arr[m])
                l = m + 1;
            else 
                h = m - 1;
        }
        ind = h;
        System.out.println(ind);
    }
}
