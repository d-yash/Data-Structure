#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

int findUpperBound(vector<int> arr, int target){
    int low = 0, high = arr.size();
    int ans;

    while(low <= high){
        int mid = low + (high-low)/2;

        if(arr[mid] > target){
            ans = mid;
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return ans;
}
int main()
{
    vector<int> arr = {3, 5, 8, 9, 15, 19};
    cout<<findUpperBound(arr, 9)<<endl;
    return 0;
}