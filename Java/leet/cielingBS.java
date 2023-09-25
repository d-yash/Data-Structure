class cielingBS{
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int l = 0, h = arr.length-1, m = 0;
        int ind = -1;
        while(l <= h){
            m = (l + h) / 2;
            System.out.println("l:" + l + " m:" + m + " h:" + h);
            if(target == arr[m])
                ind = m;
            else if(target > arr[m])
                l = m + 1;
            else
                h = m - 1;
        }
        ind = l;
        System.out.println(ind);
    }
}