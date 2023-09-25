#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findPeakElement(vector<int> arr){
    int n =arr.size();
    if(n == 1)  return arr[0];
    else if(arr[0] > arr[1])    return arr[0];
    else if(arr[n-1] > arr[n-2])    return arr[n-1];    

    int low = 1, high = n-2;
    while (low <= high)
    {
        int mid = low + (high-low)/2;

        if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
            return mid;
        else if(arr[mid] > arr[mid-1])
            //left part is normal so eliminate it and move to right  
            low = mid + 1;
        else    
            //Right part was normal so eliminate it and move to left
            high = mid - 1;
    }
    return -1;
}  
int main()
{
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
    int ans = findPeakElement(arr);
    cout << "The peak is at index: " << ans << "\n";
    return 0;
}