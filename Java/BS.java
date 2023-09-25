import java.util.Scanner;

public class BS {

    //Time complexity : O(logn)     func = n/2^k
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];  //true if ascending; flase if descending

        while(start <= end){
            int mid = start + (end - start)/2;  
            if(arr[mid] == target){
                return mid;
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
            /**
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            } 
            */
        }
        return -1;
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
        System.out.println("Index : " + binarySearch(arr, target));
    }
}
