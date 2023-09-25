public class orderAgnosticBS{
    public static void main(String[] args) {
        int[] arr = {1,5,11,15,19,21,35,45,90};
        int target = 90;
        System.out.println(orderAgnostic(arr, target));
    }
    public static int orderAgnostic(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(arr[mid] > target)
                    end = mid - 1;
                else    
                    start = mid + 1; 
            }
            else{
                if(arr[mid] < target)
                    end = mid - 1;
                else    
                    start = mid + 1; 
            }
        }
        return -1;
    }
}

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int asc = binarySearch(mountainArr, target, 0, peak, true);
        int desc = binarySearch(mountainArr, target, peak+1, mountainArr.length() - 1, false);
        if(asc < desc){
            return asc;
        }
        else if(asc > desc){
            return desc;
        }
        else{
            return -1;
        }
    }
    int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            int elementMid = mountainArr.get(mid);
            int midPlusOne = mountainArr.get(mid + 1);
            if(elementMid > midPlusOne){
                end = mid;
            }
            else if(elementMid < midPlusOne){
                start = mid + 1;
            }
        }
        return start;
    }
    int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending){
        while(start <= end){
            int mid = start + (end - start)/2;
            int elementMid = mountainArr.get(mid);
            if(isAscending){
                if(elementMid > target){
                    end = mid - 1;
                }
                else if(elementMid < target){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(elementMid > target){
                    start = mid + 1;
                }
                else if(elementMid < target){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}


/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int ans = binarySearch(mountainArr, target, 0, peak);
        if(ans != -1){
            return ans;
        }
        return binarySearch(mountainArr, target, peak+1, mountainArr.length()-1);
    }
    public int findPeak(MountainArray ma){
        int start = 0, end = ma.length() - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(ma.get(mid) > ma.get(mid+1))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    public int binarySearch(MountainArray ma, int target, int start, int end){
        int mid = start + (end - start)/2;
        boolean isAsc = ma.get(start) < ma.get(end); 
        while(start < end){ 
            if(target == ma.get(mid))
                return mid;
            if(isAsc){
                if(target > ma.get(mid))
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else{
                if(target < ma.get(mid))
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            
        }
        return -1;
    }
}