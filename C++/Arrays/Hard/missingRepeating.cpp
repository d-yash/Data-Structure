#include<iostream>
#include <bits/stdc++.h>
#include <vector>
using namespace std;

// vector<int> find_repeat_missing(vector<int> arr){
//     vector<int> ans;
//     int n = arr.size();
//     int hash[n+1] = {0};
//
//     for(int i=0; i<n; i++){
//         hash[arr[i]]++;
//     }
//
//     int missing = -1, repeating = -1;
//     for(int i=1; i<=n; i++){
//         if(hash[i] == 0){
//             missing = i;
//         }
//         else if(hash[i] == 2){
//             repeating = i;
//         }
//
//         if(missing != -1 && repeating != -1)
//             break;
//     }    
//     return {missing, repeating};
// }

vector<int> find_repeating_missing(vector<int> arr){
    int n = arr.size();
    long long sn = (n*(n+1))/2;
    long long s2n = (n*(n+1)*(2*n+1))/6;

    long long s = 0, s2 = 0;
    for(int i=0; i<n; i++){
        s += arr[i];
        s2 += (long long)arr[i] * (long long)arr[i];
    }

    int value1 = s - sn;
    int value2 = s2 - s2n;

    value2 = value2 / value1;

    int x = (value2 + value1)/2;
    int y = x - value1;
    
    return{(int)x, (int)y};
}
int main()
{
    vector<int> arr = {1,2,3,1,4,6};
    vector<int> ans = find_repeating_missing(arr);    
    cout<<"Repeating : "<<ans[0]<<"\nMissing : "<<ans[1]<<endl;
    return 0;
}