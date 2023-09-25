#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// 1. Brute - 
// int solve(vector<int> arr){
//     int maxLen = 0;
//     int n = arr.size(); 
//     for(int i=0; i<n; i++){
//         int sum = arr[i];
//         for(int j=i+1; j<n; j++){
//             sum += arr[j];

//             if(sum == 0){
//                 maxLen = max(maxLen, j-i+1);
//             }
//         }
//     }
//     return maxLen;
// }

// 2. Optimal
int solve(vector<int> arr){
    int maxLen = 0;
    int n = arr.size();
    int sum = 0;
    unordered_map<int, int> mpp;

    for(int i=0; i<n; i++){
        sum += arr[i];
        if(sum == 0){
            maxLen = i + 1;
        }else{
            if(mpp.find(sum) != mpp.end()){
                maxLen = max(maxLen, i - mpp[sum]);
            }else{
                mpp[sum] = i;
            }
        }
    }
    return maxLen;
} 
int main() {
    vector<int> a = {9, -3, 3, -1, 6, -5};
    cout << solve(a) << endl;

    return 0;
}