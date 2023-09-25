#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int singleNonDuplicate(vector<int> arr){
    int n = arr.size();
    if(n == 1)  return arr[0];
    if(arr[0] != arr[1])    return arr[0];
    if(arr[n-1] != arr[n-2])    return arr[n-1];

    int low = 1, high = n-2;
    while(low <= high){
        int mid = low + (high-low)/2;

        if(arr[mid] != arr[mid-1]  &&  arr[mid] != arr[mid+1])
            return arr[mid];

        
    }
}
int main()
{
    vector<int> arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
    int ans = singleNonDuplicate(arr);
    cout << "The single element is: " << ans << "\n";
    return 0;
}