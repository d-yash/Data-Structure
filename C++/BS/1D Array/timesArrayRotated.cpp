#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findKRotation(vector<int> arr){
    int low = 0, high = arr.size()-1;
    int ans = INT_MAX;
    int ind = -1;

    while(low <= high){
        int mid = low + (high-low)/2;

        //edge case if whole array is sorted then find min
        if (arr[low] <= arr[high]) {
            if(arr[low] < ans){
                ans = arr[low];
                ind = low;
            }
            break;
        }

        if(arr[low] <= arr[mid]){
        //left part is sorted so we will find min and eliminate left part and move to right part
            if(arr[low] < ans){
                ans = arr[low];
                ind = low;
            }
            low = mid + 1;
        }else{
            //find the min of right part and move further
            if(arr[mid] < ans){
                ans = arr[mid];
                ind = mid;
            }
            high = mid - 1;
        }
    }
    return ind;
}

int main()
{
    vector<int> arr = {4, 5, 6, 7, 0, 1, 2, 3};
    int ans = findKRotation(arr);
    cout << "The array is rotated " << ans << " times.\n";
    return 0;
}