#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute force - Using 2 for loops
// int maxProductSubArray(vector<int> a){
//     int result = INT_MIN;
//     int n = a.size();
//
//     for(int i=0; i<n; i++){
//         int prod = 1;
//         for(int j=i; j<n; j++){
//             prod *= a[j];
//             result = max(result, prod);
//         }
//     }
//     return result;
// }

int maxProductSubArray(vector<int> a){
    int n = a.size(); //size of array.

    int pre = 1, suff = 1;
    int ans = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (pre == 0) pre = 1;
        // if (suff == 0) suff = 1;
        pre *= a[i];
        // suff *= arr[n - i - 1];
        // ans = max(ans, max(pre, suff));
        ans = max(ans, pre);
    }
    return ans;
}

int main() {
    vector<int> nums = {1,2,-3,0,-4,-5};
    cout<<"The maximum product subarray: "<<maxProductSubArray(nums);
    return 0;
}