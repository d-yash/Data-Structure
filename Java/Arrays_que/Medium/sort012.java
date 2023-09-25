import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort012 {
    // static ArrayList<Integer> getSorted(int arr[]) {
    // {
    // Brute force approach by counting the no. of 0,1,2
    // ArrayList<Integer> al = new ArrayList<>();

    // int count0 = 0, count1 = 0, count2 = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0)
    // count0++;
    // else if (arr[i] == 1)
    // count1++;
    // else
    // count2++;
    // }
    // for (int i = 0; i < count0; i++) {
    // al.add(0);
    // }
    // for (int i = count0; i < count1 + count0; i++) {
    // al.add(1);
    // }
    // for (int i = count0 + count1; i < arr.length; i++) {
    // al.add(2);
    // }
    // return al;
    // }
    // }
    static int[] getSorted(int arr[]) {
        //OPtimal approach - Three pointer approach
        int low = 0, high = arr.length - 1, mid = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                //swapping low and mid
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                //swaping mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                mid++;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        int ans[] = getSorted(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}