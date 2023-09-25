import java.util.*;

public class peakOfMountain {
    public static void main(String[] args) {
        int[] arr = {-1,5,8,12,88,90,-6,1,2,4,6};
        System.out.println(bs(arr));
    }
    public static int bs(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return end+1;
    }
}
