#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;
    
int findMin(vector<int> arr){
    int low = 0, high = arr.size()-1;
    int ans = INT_MAX;
    int i = 0;
    while(low <= high){
        int mid = low + (high-low)/2;

        //edge case if whole array is sorted then find min
        if (arr[low] <= arr[high]) {
            ans = min(ans, arr[low]);
            break;
        }

        if(arr[low] <= arr[mid]){
        //left part is sorted so we will find min and eliminate left part and move to right part
            ans = min(ans, arr[low]);
            low = mid + 1;
        }else{
            //find the min of right part and move further
            ans = min(ans, arr[mid]);
            high = mid - 1;
        }
    }
    return ans;
}
int main()
{
    vector<int> arr = {4, 5, 6, 7, 0, 1, 2, 3};
    int ans = findMin(arr);
    cout << "The minimum element is: " << ans << "\n";
    return 0;
}