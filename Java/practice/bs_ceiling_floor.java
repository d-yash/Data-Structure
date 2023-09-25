import java.util.Scanner;

public class bs_ceiling_floor {

    //Time complexity : O(logn)     func = n/2^k
    //returns the smallest element which is greater than or equal to the target
    public static int getCeilingValue(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];  //true if ascending; flase if descending

        while(start <= end){
            int mid = start + (end - start)/2;  
            if(arr[mid] == target){
                return arr[mid]; 
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                    // ceilingValue = arr[mid];    //mid element is greater than target, it may be the result that's why it is taken  as ceiling value
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                    // ceilingValue = arr[mid];     //mid element is greater than target, it may be the result that's why it is taken  as ceiling value
                }
            }
        }

        if(isAsc){
            return arr[start];
        } 
        else{
            return arr[end];
        }
    }
    public static int getFloorValue(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];  //true if ascending; flase if descending

        while(start <= end){
            int mid = start + (end - start)/2;  
            if(arr[mid] == target){
                return arr[mid]; 
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        if(isAsc){
            return arr[end];
        } 
        else{
            return arr[start];
        }
    }
    public static void main(String[] args) {
        int noOfElements;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the no. of Elements : ");
        noOfElements = sc.nextInt();
        int arr[] = new int[noOfElements];

        System.out.println("Enter values ..... ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the target : ");
        int target = sc.nextInt();
        // System.out.println("Ceiling Value : " + getCeilingValue(arr, target));
        System.out.println("Floor Value : " + getCeilingValue(arr, target));
    }
}
