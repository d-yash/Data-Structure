#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute force - checking each subarray
// int subarraysWithXorK(vector<int> a, int k){
//     int XOR = 0;
//     int n = a.size();
//     int count = 0;
//
//     for(int i=0; i<n; i++){
//         XOR = 0;
//         for(int j=i; j<n; j++){
//             XOR = XOR ^ a[j];
//
//             if(XOR == k)
//                 count++;
//         }
//     }
//     return count;
// }

int subarraysWithXorK(vector<int> a, int k){
    int count = 0;
    int n = a.size();
    int xr = 0;

    map<int, int> mpp;
    mpp[0] = 1;     // storing - (0,1)

    for(int i=0; i<n; i++){
        xr = xr ^ a[i];

        int x = xr ^ k;
        count += mpp[x];

        mpp[xr]++; 
    }
    return count;
}
int main()
{
    vector<int> a = {4, 2, 2, 6, 4};
    int k = 6;
    int ans = subarraysWithXorK(a, k);
    cout << "The number of subarrays with XOR k is: "
         << ans << "\n";
    return 0;
}